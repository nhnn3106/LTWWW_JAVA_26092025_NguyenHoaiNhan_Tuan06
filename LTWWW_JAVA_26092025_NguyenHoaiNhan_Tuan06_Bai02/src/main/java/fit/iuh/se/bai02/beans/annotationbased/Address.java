package fit.iuh.se.bai02.beans.annotationbased;


import jakarta.persistence.Embeddable;
import lombok.*;
import org.springframework.stereotype.Component;

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