package sam.guru.bank.samba_bank.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sam.guru.bank.samba_bank.model.Loans;
import sam.guru.bank.samba_bank.repository.LoansRepository;

import java.util.List;

@RestController
@RequestMapping("/loans")
@RequiredArgsConstructor
public class LoansController {

    private final LoansRepository loansRepository;
    @GetMapping("myLoans")
    public ResponseEntity<?> geLoansDetails(@RequestParam int id) {
        List<Loans> loans = loansRepository.findByCustomerId(id);
        if (loans == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(loans);
    }
}
