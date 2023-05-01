package sam.guru.bank.samba_bank.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import sam.guru.bank.samba_bank.model.Customer;
import sam.guru.bank.samba_bank.repository.CustomerRepository;

@RequiredArgsConstructor
@RestController
public class LoginController {

    private final CustomerRepository customerRepository;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<?> signUp(@RequestBody Customer customer) {

        Customer savedCustomer = null;
        ResponseEntity responseEntity = null;
        System.out.println("customer = " + customer);
       try {
           String encodedPassword = passwordEncoder.encode(customer.getPwd());
              customer.setPwd(encodedPassword);
           savedCustomer = customerRepository.save(customer);
          if (savedCustomer.getId() > 0) {
              responseEntity = ResponseEntity
                      .status(HttpStatus.CREATED)
                      .body("Customer created successfully");
          }
       } catch (Exception e) {
           responseEntity = ResponseEntity
                   .status(HttpStatus.INTERNAL_SERVER_ERROR)
                   .body("Error while creating customer");
    }
        return responseEntity;
    }

}
