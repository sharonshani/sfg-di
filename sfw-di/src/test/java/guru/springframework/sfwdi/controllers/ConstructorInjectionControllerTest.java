package guru.springframework.sfwdi.controllers;

import guru.springframework.sfwdi.services.GreetingtServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectionControllerTest {

    ConstructorInjectionController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectionController(new GreetingtServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}