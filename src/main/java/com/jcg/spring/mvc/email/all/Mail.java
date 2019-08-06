package com.jcg.spring.mvc.email.all;

import org.springframework.context.annotation.Bean;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

public class Mail {
    @Bean
    MailSender mailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

        mailSender.setHost("smtp.office365.com");
        mailSender.setPort(587);

        mailSender.setUsername("ericssonstart@outlook.com");
        mailSender.setPassword("qwerty12345");

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.quitwait", "false");
        mailSender.setJavaMailProperties(props);

        return mailSender;
    }
}
