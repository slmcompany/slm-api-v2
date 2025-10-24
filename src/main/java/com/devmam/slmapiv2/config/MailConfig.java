package com.devmam.slmapiv2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class MailConfig {

    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);

        mailSender.setUsername("vantaitienlen@gmail.com");
        mailSender.setPassword("adrm hpft bzqq aels"); // <- App Password

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true"); // TLS bắt buộc với port 587
        props.put("mail.debug", "false");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com"); // Rất quan trọng
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");

        return mailSender;
    }

}