package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class SetterBasedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public SetterBasedController(){

    }

    public String getGreeting(){
        return greetingService.sayGreeting();

    }
}
