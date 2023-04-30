package sam.guru.bank.samba_bank.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sam.guru.bank.samba_bank.model.Customer;
import sam.guru.bank.samba_bank.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@Service
public class SambaBankUserDetail implements UserDetailsService {

    private final CustomerRepository customerRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String userName , password = null;
        List<GrantedAuthority> authorities = null;
        List<Customer> customerList = customerRepository.findByEmail(username);
        if(customerList.size() > 0) {
            userName = customerList.get(0).getEmail();
            password = customerList.get(0).getPwd();
            authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority(customerList.get(0).getRole()));
        } else {
            throw new UsernameNotFoundException("User not found");
        }

        return new User(userName, password,authorities);
    }
}
