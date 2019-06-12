package com.xxf.consumerfeign.web;

import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements FeignService {
    @Override
    public String hi(String name) {
        return "hi " + name + " , error occurred";
    }
}
