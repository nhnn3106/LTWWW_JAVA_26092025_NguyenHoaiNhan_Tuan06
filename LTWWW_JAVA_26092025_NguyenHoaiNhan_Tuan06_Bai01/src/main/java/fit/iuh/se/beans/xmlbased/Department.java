package fit.iuh.se.beans.xmlbased;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Department {
    @Id
    private String id;
    private String name;

    @OneToOne
    private Faculty faculty;
}
