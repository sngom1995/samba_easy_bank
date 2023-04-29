package sam.guru.bank.samba_bank.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
public class LoansController {

    @GetMapping("myLoans")
    public String geLoansDetails() {
        return "Here is your loans details";
    }
}
