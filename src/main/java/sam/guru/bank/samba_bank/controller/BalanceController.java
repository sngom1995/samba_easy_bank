package sam.guru.bank.samba_bank.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sam.guru.bank.samba_bank.model.AccountTransactions;
import sam.guru.bank.samba_bank.repository.AccountTransactionRepository;

import java.util.List;

@RestController
@RequestMapping("/balance")
@RequiredArgsConstructor
public class BalanceController {

    private final AccountTransactionRepository accountTransactionRepository;
    @GetMapping("myBalance")
    public ResponseEntity<?> geBalanceDetails(@RequestParam int Id) {
        List<AccountTransactions> accountTransactions = accountTransactionRepository.findByCustomerIdOrderByTransactionDtDesc(Id);
        if (accountTransactions == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(accountTransactions);
    }
}
