package com.example.mails.service;

import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailService {

    private final JavaMailSender javaMailSender;

    @Async
    public void sendEmail(String email) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("ehddnr1022@gmail.com");        //보내는사람 이메일
        message.setTo(email);                           //받는사람 이메일
        message.setSubject("이메일 인증 테스트입니다.");     //제목
        message.setText("인증번호: 123456");              //내용
        javaMailSender.send(message);
    }
}