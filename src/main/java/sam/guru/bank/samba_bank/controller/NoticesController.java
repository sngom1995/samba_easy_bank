package sam.guru.bank.samba_bank.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notices")
public class NoticesController {

    @RequestMapping
    public String geNotices() {
        return "Here is your notices details";
    }
}
