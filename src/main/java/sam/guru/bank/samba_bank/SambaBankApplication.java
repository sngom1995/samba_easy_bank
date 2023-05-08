package sam.guru.bank.samba_bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity(debug = true)
public class SambaBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(SambaBankApplication.class, args);
    }

}
