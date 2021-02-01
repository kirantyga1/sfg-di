package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println("--primaryGreetingService");
        System.out.println(myController.sayHello());


        System.out.println("Property---------------");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("Setter Injection---------------");
        SetterBasedController setterBasedController = (SetterBasedController) ctx.getBean("setterBasedController");
        System.out.println(setterBasedController.getGreeting());

        System.out.println("Constructor Injection---------------");
        ConstructionInjectionController constructionInjectionController = (ConstructionInjectionController) ctx.getBean("constructionInjectionController");
        System.out.println(constructionInjectionController.getGreeting());


    }


}
