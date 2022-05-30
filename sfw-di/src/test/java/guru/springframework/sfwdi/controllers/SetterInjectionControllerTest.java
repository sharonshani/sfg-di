package guru.springframework.sfwdi.controllers;

import guru.springframework.sfwdi.services.GreetingtServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectionControllerTest {

    SetterInjectionController controller;

    @BeforeEach
    void setUp() {

        controller = new SetterInjectionController();
        controller.setGreetingService(new GreetingtServiceImpl());
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}