package cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Repositories;

import cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Domain.BranchOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchOfficeRepository extends JpaRepository<BranchOffice, Integer> {


}
