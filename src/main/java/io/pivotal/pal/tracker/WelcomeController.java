package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

/*    @Value("${WELCOME_MESSAGE}")*/
    String hello;




    public WelcomeController(@Value("${WELCOME_MESSAGE}") String msg) {
        hello = msg;
    }

    @GetMapping("/")
    public String sayHello() {

        return hello;
    }
}



