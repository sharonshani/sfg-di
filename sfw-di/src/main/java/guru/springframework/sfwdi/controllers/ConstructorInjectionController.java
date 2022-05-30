package guru.springframework.sfwdi.controllers;

import guru.springframework.sfwdi.services.GreetingtService;

public class ConstructorInjectionController {

    private final GreetingtService greetingService;

    public ConstructorInjectionController(GreetingtService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
