package sam.guru.bank.samba_bank.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @RequestMapping
    public String geContact() {
        return "Here is your contact details";
    }
}
