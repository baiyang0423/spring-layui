package com.bw.cultivate.webtop.util.rabbiteMQ;

import com.alibaba.fastjson.JSONObject;
import com.bw.cultivate.webtop.util.result.WsgResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.GetMapping;
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
public class SendMQ {

    @Resource
    private AmqpTemplate amqpTemplate;



    @GetMapping("/rabbitmq/send/message")
    public WsgResult sendMessage(){
        WsgResult result = new WsgResult();
        try{
            JSONObject json = new JSONObject();
            json.put("id","aaa");
            json.put("word","This is test message ！");
            amqpTemplate.convertAndSend("queue-task-test" ,json.toJSONString());
            log.info("RabbitMQ发送消息成功！");
        }catch (Exception e){

          log.error(e.getMessage());

        }


        return  result;
    }

}
