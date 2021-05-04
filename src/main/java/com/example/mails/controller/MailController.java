package com.example.mails.controller;

import com.example.mails.service.EmailSenderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    private final EmailSenderService emailSenderService;

    public MailController(EmailSenderService emailSenderService){
        this.emailSenderService = emailSenderService;
    }

    @PostMapping("/send")
    public String sendEmail(@RequestParam String email_to){
        emailSenderService.sendEmail(email_to);
        return "보내기 성공!!";
    }

}
