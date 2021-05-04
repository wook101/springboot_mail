package com.example.mails.controller;

import com.example.mails.service.EmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    private final EmailService emailService;

    public MailController(EmailService emailService){
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public String sendEmail(@RequestParam String email){
        emailService.sendEmail(email);
        return "보내기 성공!!";
    }

}
