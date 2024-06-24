package com.mytests.spring.enablerlibrary;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.mytests.spring.feignClients")
@ConfigurationPropertiesScan(basePackages = "com.mytests.spring.configProps")
public class LibConfig {
}
