package fit.iuh.se.beans.javabased;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private String userName;
    private String password;
    private Group group;
}
