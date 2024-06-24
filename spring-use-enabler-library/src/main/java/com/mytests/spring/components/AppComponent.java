package com.mytests.spring.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppComponent {
    @Value("component from App")
    String id;

    public String getId() {
        return id;
    }
}
