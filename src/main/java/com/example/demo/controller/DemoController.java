package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/say/{content}")
    public String say(@PathVariable("content") String content) {
        log.info("content {}", content);
        return "content is " + content;
    }

}
