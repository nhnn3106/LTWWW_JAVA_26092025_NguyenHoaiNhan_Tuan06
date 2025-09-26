package fit.iuh.se.bai01.vidu04;

import fit.iuh.se.beans.xmlbased.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static ApplicationContext context;
    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("beans.xml");
        Person person1 = context.getBean("person1", Person.class);
        System.out.println(person1);
    }
}
