package guru.springframework.sfwdi.controllers;

import guru.springframework.sfwdi.services.GreetingtService;

public class SetterInjectionController {

    private GreetingtService greetingService;

    public void setGreetingService(GreetingtService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
