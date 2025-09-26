package fit.iuh.se.services;

import fit.iuh.se.beans.javabased.Group;
import fit.iuh.se.beans.javabased.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserService {
    @Bean
    public Group groupService() {
        return new Group("Admin Group");
    }

    @Bean
    public User userService_() {
        return new User("User 01", "123456", groupService());
    }
}
