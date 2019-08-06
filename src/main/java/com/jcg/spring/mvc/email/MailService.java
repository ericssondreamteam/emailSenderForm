package com.jcg.spring.mvc.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    private MailSender mailSender;

    @Autowired
    public MailService(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    void promptAdmin(String message) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setText(message);
        simpleMailMessage.setSubject("Bank Prompt");
        simpleMailMessage.setTo("aras112nowe@o2.pl");
        simpleMailMessage.setFrom("mybanktransferemail@gmail.com");

        mailSender.send(simpleMailMessage);
    }

}
