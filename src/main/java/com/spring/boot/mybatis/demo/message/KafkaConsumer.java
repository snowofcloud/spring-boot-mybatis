package com.spring.boot.mybatis.demo.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    protected static Logger logger= LoggerFactory.getLogger(KafkaConsumer.class);
    /**
     * 监听test主题,有消息就读取
     * @param message
     */
    @KafkaListener(topics = {"test"})
    public void consumer(String message){
        logger.info("test topic message : {}", message);
    }
}

