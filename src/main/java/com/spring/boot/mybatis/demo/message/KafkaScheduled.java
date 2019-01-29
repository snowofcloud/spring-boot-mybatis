package com.spring.boot.mybatis.demo.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @auther xuxq
 * @date 2019/1/29 11:21
 */
@Service
public class KafkaScheduled {
    private static Logger logger = LoggerFactory.getLogger(KafkaScheduled.class);
    @Autowired
    private KafkaProducer kafkaSender;
    // 然后每隔1分钟执行一次
    @Scheduled(fixedRate = 1000 * 20)
    public void testKafka() throws Exception {
        logger.info("KafkaScheduled...start");
        kafkaSender.sendTest();
    }
}

