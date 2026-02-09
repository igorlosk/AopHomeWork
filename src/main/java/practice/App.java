package practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("practice");

        UserService userService = context.getBean(UserService.class);
        userService.printInfo("Igor", 1L);
        userService.send("Olga", "Привет Ольга");
        userService.updateName(10L, "Igor");

        context.close();
    }
}
