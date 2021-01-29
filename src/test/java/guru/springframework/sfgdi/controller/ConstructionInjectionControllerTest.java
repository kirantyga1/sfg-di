package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructionInjectionControllerTest {

     ConstructionInjectionController controller;
    @BeforeEach
    void setUp() {
        controller=new ConstructionInjectionController(new GreetingServiceImpl());
        controller.greetingService.sayGreeting();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}