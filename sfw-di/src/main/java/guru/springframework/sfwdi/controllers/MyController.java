package guru.springframework.sfwdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String helloWorld(){
        System.out.println("Hello world");
        return "Hi!";
    }


}
