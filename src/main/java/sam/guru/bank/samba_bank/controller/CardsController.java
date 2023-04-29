package sam.guru.bank.samba_bank.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cards")
public class CardsController {

        @GetMapping("myCards")
        public String geCardsDetails() {
            return "Here is your cards details";
        }
}
