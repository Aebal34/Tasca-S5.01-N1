package cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Controllers;

import cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Dto.BranchOfficeDto;
import cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Services.BranchOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/branch-offices")
public class BranchOfficeController {

    @Autowired
    private BranchOfficeService branchOfficeService;

    @GetMapping("")
    public String getAll(Model model){
        List<BranchOfficeDto> branchOffices = branchOfficeService.getAll().getBody();
        model.addAttribute("branchOffices", branchOffices);
        return "branch-offices";
    }

    @GetMapping("/getOne/{id}")
    public String getOne(@RequestParam("id") Integer pk_ID, Model model) {

        List<BranchOfficeDto> branchOffices = new ArrayList<>();
        branchOffices.add(branchOfficeService.getOne(pk_ID).getBody());

        if(branchOffices.contains(null) || branchOffices.isEmpty()){
            return "branchOffices";
        }else{
            model.addAttribute("branchOffices", branchOffices);
            return "branch-offices";
        }
    }


    @PostMapping("/add")
    public String add(@ModelAttribute BranchOfficeDto branchOfficeDto){

        branchOfficeService.add(branchOfficeDto);
        return "redirect:/branch-offices";
    }

    @PutMapping("/update")
    public String update(BranchOfficeDto branchOfficeDto){

        branchOfficeService.update(branchOfficeDto);

        return "redirect:/branch-offices";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer pk_ID){

        System.out.println("En controller el id es "+pk_ID);
        branchOfficeService.delete(pk_ID);

        return "redirect:/branch-offices";
    }
}
