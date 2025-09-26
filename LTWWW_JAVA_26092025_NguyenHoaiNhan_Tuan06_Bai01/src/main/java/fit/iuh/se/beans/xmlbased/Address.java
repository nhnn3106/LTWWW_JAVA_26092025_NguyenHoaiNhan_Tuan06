package fit.iuh.se.beans.xmlbased;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {
    private String city;
    private String country;
    private String street;

}
