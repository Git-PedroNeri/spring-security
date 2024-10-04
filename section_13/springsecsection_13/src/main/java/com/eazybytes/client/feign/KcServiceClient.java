package com.eazybytes.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "kc-service-client", url = "http://localhost:8080")
public interface KcServiceClient {

    @GetMapping("/cards/my-cards")
    String getResource(@RequestHeader("Authorization") String token);
}

