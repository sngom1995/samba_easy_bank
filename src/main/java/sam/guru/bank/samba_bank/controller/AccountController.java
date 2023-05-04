package sam.guru.bank.samba_bank.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sam.guru.bank.samba_bank.model.Accounts;
import sam.guru.bank.samba_bank.repository.AccountRepository;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

    public final AccountRepository accountRepository;
    @GetMapping("myAccount")
    public ResponseEntity<?> geAccountDetails(@RequestParam int Id) {
        Accounts accounts = accountRepository.findByCustomerId(Id);
        if (accounts == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(accounts);
    }
}
