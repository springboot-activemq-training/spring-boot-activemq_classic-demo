package com.alpha.springbootactivemqartemisdemo.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HelloMessageListener {

    @JmsListener(destination = "hello")
    public void onMessage(String message){
        // business logic
        log.info("Received message: {}", message);
    }
}
