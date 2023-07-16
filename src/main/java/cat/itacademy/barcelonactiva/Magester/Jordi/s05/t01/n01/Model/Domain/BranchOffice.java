package cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "branch_offices")
public class BranchOffice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer pk_ID;

    String name;

    String country;
}
