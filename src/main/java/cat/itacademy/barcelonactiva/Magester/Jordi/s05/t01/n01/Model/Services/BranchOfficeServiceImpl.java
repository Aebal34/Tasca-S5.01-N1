package cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Services;

import cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Domain.BranchOffice;
import cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Dto.BranchOfficeDto;
import cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Repositories.BranchOfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchOfficeServiceImpl implements BranchOfficeService{

    @Autowired
    private BranchOfficeRepository branchOfficeRepository;

    @Override
    public ResponseEntity<String> add(BranchOfficeDto branchOfficeDto) {



    }

    @Override
    public ResponseEntity<String> update(Integer pk_Id, String name, String country) {
        return null;
    }

    @Override
    public ResponseEntity<String> delete(Integer pk_Id) {
        return null;
    }

    @Override
    public ResponseEntity<BranchOffice> getOne(Integer pk_Id) {
        return null;
    }

    @Override
    public ResponseEntity<List<BranchOffice>> getAll() {
        return null;
    }
}
