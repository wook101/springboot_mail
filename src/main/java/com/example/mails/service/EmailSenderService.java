package com.example.mails.service;

import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailSenderService {

    private final JavaMailSender javaMailSender;

    public void sendEmail(String email_to) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("ehddnr1022@gmail.com");  //보내는사람 이메일
        message.setTo(email_to);                  //받는사람 이메일
        message.setSubject("메일 테스트입니다.");    //제목
        message.setText("회원가입을 축하합니다.");    //내용
        javaMailSender.send(message);
    }
}