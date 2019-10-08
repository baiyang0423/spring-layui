package com.bw.cultivate.webtop.util.rabbiteMQ.config;

import com.bw.cultivate.webtop.util.rabbiteMQ.ReceiverBean;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName:  RabbitConfig
 * @Description: rabbitMQ消息接收配置类
 * @author: by_csd_hlj
 * @date: 2019/10/8  15:46
 * @version: 1.0
 */
@Configuration
public class RabbitConfig {

    //*************************************************************//
    //配置rabbitMQ 监听Container
    @Bean(name="receiverContainer")
    public SimpleMessageListenerContainer receiverContainer(ConnectionFactory connectionFactory,
                                                             MessageListenerAdapter receiverAdapter) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.setQueueNames("queue-task-test");
        container.setMessageListener(receiverAdapter);
        return container;
    }

    //配置rabbitMQ 接收消息ListenerAdapter
    @Bean(name="receiverAdapter")
    MessageListenerAdapter createJobListenerAdapter(ReceiverBean receiverBean) {
        return new MessageListenerAdapter(receiverBean, "receiver");
    }
    //*************************************************************//


}
