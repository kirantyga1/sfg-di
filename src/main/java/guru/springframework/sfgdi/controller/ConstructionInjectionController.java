package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructionInjectionController {

      GreetingService greetingService;

    public ConstructionInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public ConstructionInjectionController(){

    }
    public String getGreeting(){
        return greetingService.sayGreeting();

    }
}
