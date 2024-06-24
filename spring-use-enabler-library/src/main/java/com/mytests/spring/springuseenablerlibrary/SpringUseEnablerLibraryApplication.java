package com.mytests.spring.springuseenablerlibrary;

import com.mytests.spring.enablerlibrary.LibConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(LibConfig.class)
public class SpringUseEnablerLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringUseEnablerLibraryApplication.class, args);
    }

}
