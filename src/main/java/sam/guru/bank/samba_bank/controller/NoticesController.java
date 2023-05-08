package sam.guru.bank.samba_bank.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sam.guru.bank.samba_bank.repository.NoticeRepository;

@RestController
@RequestMapping("/notices")
@RequiredArgsConstructor
public class NoticesController {

    private final NoticeRepository noticesRepository;
    @GetMapping
    public ResponseEntity<?> geNotices() {

        return ResponseEntity.ok(noticesRepository.findAll());
    }
}
