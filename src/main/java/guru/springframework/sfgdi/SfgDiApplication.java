package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.MyController;
import guru.springframework.sfgdi.controller.PropertyInjectedController;
import guru.springframework.sfgdi.controller.ConstructionInjectionController;
import guru.springframework.sfgdi.controller.SetterBasedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static <ConstructionInjectionController> void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");
        String str = myController.sayHello();
        System.out.println(str);


        System.out.println("Property---------------");
        PropertyInjectedController  propertyInjectedController= (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("Setter Injection---------------");
        SetterBasedController setterBasedController= (SetterBasedController) ctx.getBean("setterBasedController");
        System.out.println(setterBasedController.getGreeting());

//        System.out.println("Constructor Injection---------------");
//        ConstructionInjectionController constructionInjectionController= (ConstructionInjectionController) ctx.getBean("constructionInjectionController");
//        System.out.println(constructionInjectionController.getGreeting());


    }


}
