package com.bw.cultivate.webtop.wsg.email;

import com.alibaba.fastjson.JSONObject;
import com.bw.cultivate.webtop.ai.email.ISendEmailApp;
import com.bw.cultivate.webtop.util.result.WsgResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName:
 * @Description:
 * @author: by_csd_hlj
 * @date:
 * @version: 1.0
 */
@RestController
@Slf4j
public class SendEmailWsg {

    @Resource
    private ISendEmailApp sendEmailApp;


    @PostMapping("/email/send")
    public WsgResult send(@RequestBody JSONObject json){
        WsgResult result = new WsgResult();
        try{

            log.info("开始 。。。");
            //普通文本邮件
//            sendEmailApp.send(json);
            //富文本邮件
            sendEmailApp.sendInlineResourceMail(json);
            //带附件邮件

            //带图片邮件




        }catch (Exception e){

            log.error(e.getMessage());

        }

        return result;
    }



}
