package guru.springframework.sfwdi.controllers;

import guru.springframework.sfwdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {

    private final GreetingService greetingService;

    public I18NController(@Qualifier("i18Service") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
