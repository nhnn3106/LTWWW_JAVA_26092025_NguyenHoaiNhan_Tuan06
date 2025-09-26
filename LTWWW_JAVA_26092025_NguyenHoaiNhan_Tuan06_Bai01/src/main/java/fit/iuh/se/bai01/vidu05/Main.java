package fit.iuh.se.bai01.vidu05;

import fit.iuh.se.beans.xmlbased.Class_;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("beans.xml");
        Class_ class2 = context.getBean("class2", Class_.class);
        System.out.println(class2);
    }
}
