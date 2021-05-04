package com.example.mails.controller;

import com.example.mails.service.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MailController {

    private final EmailService emailService;

    public MailController(EmailService emailService){
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public void sendEmail(@RequestBody Map<String, String> map){
        emailService.sendEmail(map.get("email"));
    }

}
