package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructionInjectionControllerTest {

     ConstructionInjectionController controller;
    @BeforeEach
    void setUp() {
        controller=new ConstructionInjectionController(new ConstructorGreetingService());
        controller.greetingService.sayGreeting();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}