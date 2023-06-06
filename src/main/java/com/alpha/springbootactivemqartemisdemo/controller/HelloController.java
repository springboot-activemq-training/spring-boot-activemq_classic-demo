package com.alpha.springbootactivemqartemisdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping("/hello")
    public String sayHello(@RequestBody String message) {
        jmsTemplate.convertAndSend("hello", message);
        return "Message sent: " + message;
    }
}
