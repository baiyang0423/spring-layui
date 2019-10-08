package com.bw.cultivate.webtop.util.rabbiteMQ;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ClassName:
 * @Description:
 * @author: by_csd_hlj
 * @date:
 * @version: 1.0
 */
@Service("receiverBean")
@Slf4j
public class ReceiverBean {


    public void receiver( String msg_ ){
        log.info("RabbitMQ队列接收信息："+msg_);
    }

}
