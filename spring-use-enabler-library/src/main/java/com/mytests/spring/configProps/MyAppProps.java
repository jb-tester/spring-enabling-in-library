package com.mytests.spring.configProps;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("my.app.props")
public class MyAppProps {

    String foo;
    String bar;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }
}
