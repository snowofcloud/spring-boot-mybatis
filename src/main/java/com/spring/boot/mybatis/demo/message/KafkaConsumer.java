package com.spring.boot.mybatis.demo.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class KafkaConsumer {
    protected static Logger logger= LoggerFactory.getLogger(KafkaConsumer.class);
    /**
     * 监听test主题,有消息就读取
     * @param message
     */
    @KafkaListener(topics = {"test"})
    public void consumer(String message){
        ArrayList<String> arrayList = new ArrayList<>();
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        //ConcurrentHashMap一般不用size判断容器大小，因为它要统计每个分段锁元素个数，比较耗时，使用isEmpty()


        logger.info("test topic message : {}", message);
    }
}

