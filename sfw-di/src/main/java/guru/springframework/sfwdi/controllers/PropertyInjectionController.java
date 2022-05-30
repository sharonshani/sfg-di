package guru.springframework.sfwdi.controllers;

import guru.springframework.sfwdi.services.GreetingtService;

public class PropertyInjectionController {

    public GreetingtService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
