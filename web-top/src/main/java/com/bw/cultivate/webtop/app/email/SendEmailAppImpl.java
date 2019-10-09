package com.bw.cultivate.webtop.app.email;

import com.alibaba.fastjson.JSONObject;
import com.bw.cultivate.webtop.ai.email.ISendEmailApp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @ClassName:
 * @Description:
 * @author: by_csd_hlj
 * @date:
 * @version: 1.0
 */
@Service
@Slf4j
public class SendEmailAppImpl implements ISendEmailApp{

    @Resource
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String from;

    @Override
    public void send(JSONObject json) {

        log.info(json.toJSONString());

        log.info("发送邮件！");
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from); // 邮件发送者
        message.setTo("baiyang900423@163.com"); // 邮件接受者
        message.setSubject("测试spring boot 邮件"); // 主题
        message.setText("<html><head></head><body><h3>哈哈，什么都没有</h3></body></html>"); // 内容

        mailSender.send(message);
    }

    @Override
    public void sendInlineResourceMail(JSONObject json) {
        try{
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo(json.getString("to"));
            helper.setSubject(json.getString("subject"));
            helper.setText(json.getString("content"), true);
//            File file = new File(rscPath);
//            FileSystemResource res = new FileSystemResource(file);
//            helper.addInline(rscId, res);

            mailSender.send(message);
        }catch (Exception e){

          log.error(e.getMessage());

        }

    }
}
