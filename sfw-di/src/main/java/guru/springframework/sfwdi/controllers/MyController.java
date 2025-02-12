package guru.springframework.sfwdi.controllers;

import guru.springframework.sfwdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayhello(){
        return greetingService.sayGreeting();
    }


}
