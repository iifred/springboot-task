package com.springboot.task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class SpringbootTaskApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("今晚开会");
        simpleMailMessage.setText("时间定于：晚上7:30");
        simpleMailMessage.setTo("lzfsuru@163.com");
        simpleMailMessage.setFrom("594703382@qq.com");
        mailSender.send(simpleMailMessage);
    }

    @Test
    void sendMail() throws MessagingException {
        //创建一个复杂的消息邮件
        MimeMessage mimeMailMessage = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMailMessage,true);
        mimeMessageHelper.setSubject("1");
        mimeMessageHelper.setText("<font style='color:red;'>22</font>",true);
        mimeMessageHelper.setFrom("594703382@qq.com");
        mimeMessageHelper.setTo("lzfsuru@163.com");

        //上传文件
        mimeMessageHelper.addAttachment("1.jpg",new File("C:\\Users\\fred\\Pictures\\1.jpg"));

        mailSender.send(mimeMailMessage);
    }
}
