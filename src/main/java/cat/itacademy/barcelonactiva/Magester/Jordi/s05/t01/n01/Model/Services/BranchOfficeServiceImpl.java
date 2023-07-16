package cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Services;

import cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Domain.BranchOffice;
import cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Dto.BranchOfficeDto;
import cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Repositories.BranchOfficeRepository;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class BranchOfficeServiceImpl implements BranchOfficeService{

    @Autowired
    private BranchOfficeRepository branchOfficeRepository;

    @Override
    public ResponseEntity<String> add( BranchOfficeDto branchOfficeDto) {

        if (branchOfficeDto != null) {
            BranchOffice branchOffice = new BranchOffice();

            branchOffice.setPk_ID(branchOfficeDto.getPk_ID());
            branchOffice.setName(branchOfficeDto.getName());
            branchOffice.setCountry(branchOfficeDto.getCountry());

            branchOfficeRepository.save(branchOffice);
            return ResponseEntity.ok().body("200. Branch Office saved.");
        }else{
            return ResponseEntity.badRequest().body("Code 400. Some introduced data is wrong.");
        }
    }

    @Override
    public ResponseEntity<String> update(@RequestParam BranchOfficeDto branchOfficeDto) {

        BranchOffice branchOffice = branchOfficeRepository.findById(branchOfficeDto.getPk_ID()).orElse(null);
        if(branchOffice != null){
            branchOffice.setName(branchOfficeDto.getName());
            branchOffice.setCountry(branchOfficeDto.getCountry());
            branchOfficeRepository.save(branchOffice);
            return ResponseEntity.ok("200. Entity updated successfully");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("404. Entity not found.");
        }
    }

    @Override
    public ResponseEntity<String> delete(Integer pk_Id) {
        return null;
    }

    @Override
    public ResponseEntity<BranchOfficeDto> getOne(Integer pk_Id) {

        BranchOffice branchOffice = branchOfficeRepository.findById(pk_Id).orElse(null);
        BranchOfficeDto branchOfficeDto = new BranchOfficeDto(branchOffice.getPk_ID(), branchOffice.getName(), branchOffice.getCountry());

        return ResponseEntity.ok(branchOfficeDto);
    }

    @Override
    public ResponseEntity<List<BranchOfficeDto>> getAll() {

        List<BranchOffice> branchOffices = branchOfficeRepository.findAll();
        List<BranchOfficeDto> branchOfficesDto = new ArrayList<>();
        for(BranchOffice branchOffice : branchOffices){
            branchOfficesDto.add(new BranchOfficeDto(branchOffice.getPk_ID(),
                                                        branchOffice.getName(),
                                                        branchOffice.getCountry()));
        }

        return ResponseEntity.ok(branchOfficesDto);
    }
}
