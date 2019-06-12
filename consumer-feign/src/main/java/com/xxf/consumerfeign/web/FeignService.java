package com.xxf.consumerfeign.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// @FeignClient(value = "service-hi", fallback = HiHystrix.class)
@FeignClient(value = "service-hi")
public interface FeignService {

    @RequestMapping("hi")
    String hi(@RequestParam(value = "name") String name);
}
