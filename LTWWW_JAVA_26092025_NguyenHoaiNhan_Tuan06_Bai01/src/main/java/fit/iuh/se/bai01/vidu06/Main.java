package fit.iuh.se.bai01.vidu06;

import fit.iuh.se.beans.javabased.Group;
import fit.iuh.se.beans.javabased.User;
import fit.iuh.se.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(UserService.class);
        User user = context.getBean(User.class);
        System.out.println(user);

        Group group = context.getBean(Group.class);
        System.out.println(group);
    }
}
