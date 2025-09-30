package fit.iuh.se.bai02.beans.xmlbased;

import fit.iuh.se.bai02.beans.xmlbased.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Employee employee = context.getBean("employee1", Employee.class);

        System.out.println(employee);
    }
}
