package com.mytests.spring.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LibComponent {
    @Value("component from Lib")
    String id;

    public String getId() {
        return id;
    }
}
