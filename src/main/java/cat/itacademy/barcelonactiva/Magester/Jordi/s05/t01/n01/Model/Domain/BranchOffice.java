package cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BranchOffice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer pk_ID;

    String name;

    String country;
}
