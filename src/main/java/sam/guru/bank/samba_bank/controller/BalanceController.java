package sam.guru.bank.samba_bank.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/balance")
public class BalanceController {

    @GetMapping("myBalance")
    public String geBalanceDetails() {
        return "Here is your balance details";
    }
}
