package com.xxf.consumerfeign.controller;

import com.xxf.consumerfeign.web.FeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class TestController {

    @Resource
    private FeignService feignService;

    @RequestMapping("hi")
    public String hi(@RequestParam String name) {
        log.info("consumer-feign,name#{}", name);
        return feignService.hi(name);
    }
}
