package com.realtech.AptechBank.service;
import com.realtech.AptechBank.dto.EmailDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class EmailService {
    @Autowired
    JavaMailSender javaMailSender;
    @Value("${spring.mail.username}")
    private String senderMail;
    public void sendMail(EmailDetails emailDetails){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(senderMail);
        message.setTo(emailDetails.getReceipient());
        message.setText(emailDetails.getMessageBody());
        message.setSubject(emailDetails.getSubject());
        javaMailSender.send(message);
        System.out.println("Message sent successfully");
    }
}