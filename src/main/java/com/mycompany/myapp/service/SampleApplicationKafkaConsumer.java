package com.mycompany.myapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SampleApplicationKafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(SampleApplicationKafkaConsumer.class);
    private static final String TOPIC = "topic_sampleapplication";

    @KafkaListener(topics = "topic_sampleapplication", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consumed message in {} : {}", TOPIC, message);
    }
}
