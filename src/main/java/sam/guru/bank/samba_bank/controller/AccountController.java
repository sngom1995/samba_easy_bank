package sam.guru.bank.samba_bank.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("myAccount")
    public String geAccountDetails() {
        return "Here is your account details";
    }
}
