package cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Services;

import cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Domain.BranchOffice;
import cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Dto.BranchOfficeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface BranchOfficeService {

    ResponseEntity<String> add(BranchOfficeDto branchOfficeDto);

    ResponseEntity<String> update(BranchOfficeDto branchOfficeDto);

    ResponseEntity<String> delete(Integer pk_Id);

    ResponseEntity<BranchOfficeDto> getOne(Integer pk_ID);

    ResponseEntity<List<BranchOfficeDto>> getAll();
}
