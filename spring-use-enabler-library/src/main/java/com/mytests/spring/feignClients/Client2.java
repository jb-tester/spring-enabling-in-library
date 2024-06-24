package com.mytests.spring.feignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "client2", url = "http://localhost:8080")
public interface Client2 {

   @GetMapping("/test2")
   String test2();
}
