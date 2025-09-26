package fit.iuh.se.beans.annotationbased;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Getter
    private int id;
    @Getter
    private String userName;
    @Getter
    private String password;
    @Autowired
    private Group group;

    @Autowired
    public User(Group group) {
        this.group = group;
    }

    @Autowired
    public void setGroup(Group group) {
        this.group = group;
    }
}
