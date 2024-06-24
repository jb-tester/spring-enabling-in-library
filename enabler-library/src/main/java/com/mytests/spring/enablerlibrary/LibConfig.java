package com.mytests.spring.enablerlibrary;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.mytests.spring.feignClients")
@ConfigurationPropertiesScan(basePackages = "com.mytests.spring.configProps")
@ComponentScan("com.mytests.spring.components")
public class LibConfig {
}
