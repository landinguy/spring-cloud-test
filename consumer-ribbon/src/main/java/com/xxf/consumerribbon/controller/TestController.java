package com.xxf.consumerribbon.controller;

import com.xxf.consumerribbon.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class TestController {

    @Resource
    private HelloService helloService;

    @RequestMapping("hi")
    public String hi(@RequestParam String name) {
        log.info("consumer-ribbon,name#{}", name);
        return helloService.hi(name);
    }
}
