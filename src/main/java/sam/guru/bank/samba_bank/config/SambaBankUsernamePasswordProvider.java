package sam.guru.bank.samba_bank.config;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import sam.guru.bank.samba_bank.model.Customer;
import sam.guru.bank.samba_bank.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@Component
public class SambaBankUsernamePasswordProvider implements AuthenticationProvider {

    private final CustomerRepository customerRepository;
    private final PasswordEncoder passwordEncoder;
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String userName = authentication.getName();
        String password = authentication.getCredentials().toString();
        List<Customer> customerList = customerRepository.findByEmail(userName);
        if (customerList.size() > 0) {
            if (passwordEncoder.matches(password, customerList.get(0).getPwd())) {
                List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
                authorities.add(new SimpleGrantedAuthority(customerList.get(0).getRole()));
                return new UsernamePasswordAuthenticationToken(userName, password, authorities);
            }
            else {
                throw new AuthenticationException("Invalid password") {
                };
            }

        }
        else {
            throw new AuthenticationException("User not found") {
            };
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }
}
