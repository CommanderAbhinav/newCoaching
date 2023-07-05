package com.coaching2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendVerificationCode(String email, String verificationCode) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("Account Verification");
        message.setText("Your verification code is: " + verificationCode);
        
        System.out.println(verificationCode);

        javaMailSender.send(message);
        
        System.out.println("sent");
    }
}