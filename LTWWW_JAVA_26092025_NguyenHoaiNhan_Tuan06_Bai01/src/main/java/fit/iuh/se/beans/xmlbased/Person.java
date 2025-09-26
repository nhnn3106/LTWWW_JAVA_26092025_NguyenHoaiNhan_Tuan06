package fit.iuh.se.beans.xmlbased;

import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Person {
    private int age;
    private List<Address> addresses;
    private List<String> emails;
    private String name;
}
