package com.springcloud.cleint.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestApi {

    @Value("${who.am.i}")
    private String identity;

    @GetMapping("/test")
    public String test() {
        return identity;
    }
}
