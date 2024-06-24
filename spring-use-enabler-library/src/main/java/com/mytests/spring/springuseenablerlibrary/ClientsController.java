package com.mytests.spring.springuseenablerlibrary;

import com.mytests.spring.components.AppComponent;
import com.mytests.spring.components.LibComponent;
import com.mytests.spring.configProps.MyAppProps;
import com.mytests.spring.configProps.MyProps;
import com.mytests.spring.feignClients.Client1;
import com.mytests.spring.feignClients.Client2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientsController {

    private final Client1 client1;
    private final MyProps myProps;
    private final MyAppProps myAppProps;
    private final Client2 client2;
    private final LibComponent libComponent;
    private final AppComponent appComponent;

    public ClientsController(Client1 client1, MyProps myProps, LibComponent libComponent, // library beans
                             MyAppProps myAppProps, Client2 client2, AppComponent appComponent) { // local app beans
        this.client1 = client1;
        this.myProps = myProps;
        this.myAppProps = myAppProps;
        this.client2 = client2;
        this.libComponent = libComponent;
        this.appComponent = appComponent;
    }

    @GetMapping("/server/t1")
    public String t1() {
        return libComponent.getId() + " " + myProps.getFoo() + " " + client1.test1();
    }

    @GetMapping("/server/t2")
    public String t2() {
        return appComponent.getId() + " " + myAppProps.getFoo() + " " + client2.test2();
    }
}
