package practice;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import practice.aop.NotNullArgs;

@Component
public class UserService {

    @NotNullArgs
    public void updateName(Long userId, String name){
        System.out.printf("Пользователю с id: %d поменяли имя на %s\n", userId, name);
    }
    @NotNullArgs
    public void send(String to, String text){
        System.out.printf("Сообщение отправлено пользователю: %s. В нем сообщение: %s\n", to, text);
    }
    @NotNullArgs
    public void printInfo(String name, Long id){
        System.out.printf("Пользователь с именем %s и ID %d\n", name, id);
    }
}
