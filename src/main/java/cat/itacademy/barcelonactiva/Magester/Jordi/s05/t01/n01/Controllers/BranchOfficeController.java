package cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Controllers;

import cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Dto.BranchOfficeDto;
import cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Services.BranchOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/branch-office")
public class BranchOfficeController {

    @Autowired
    private BranchOfficeService branchOfficeService;

    @PostMapping("/add")
    public void add(@RequestBody BranchOfficeDto branchOfficeDto){
        branchOfficeService.add(branchOfficeDto);
    }
}
