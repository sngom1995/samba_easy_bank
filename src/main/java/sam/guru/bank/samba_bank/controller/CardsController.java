package sam.guru.bank.samba_bank.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sam.guru.bank.samba_bank.model.Cards;
import sam.guru.bank.samba_bank.repository.CardsRepository;

import java.util.List;

@RestController
@RequestMapping("/cards")
@RequiredArgsConstructor
public class CardsController {

    private final CardsRepository cardsRepository;

        @GetMapping("myCards")
        public ResponseEntity<?> geCardsDetails(@RequestParam int id) {
            List<Cards> cards = cardsRepository.findByCustomerId(id);
            if (cards == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(cards);
        }
}
