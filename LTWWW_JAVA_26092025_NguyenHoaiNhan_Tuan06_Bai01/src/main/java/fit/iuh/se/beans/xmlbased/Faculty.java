package fit.iuh.se.beans.xmlbased;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Faculty {
    @Id
    private String id;
    private String name;
}
