package com.mytests.spring.feignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "client1", url = "http://localhost:8080")
public interface Client1 {

   @GetMapping("/test1")
   String test1();
}
