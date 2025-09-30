package fit.iuh.se.bai02.beans.javabased;


import jakarta.persistence.Embeddable;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Embeddable
@ToString
public class Address {
    private String city;
    private String state;
    private String country;

}