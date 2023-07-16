package cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Controllers;

import cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Domain.BranchOffice;
import cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Dto.BranchOfficeDto;
import cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Services.BranchOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class ViewController {

    @Autowired
    private BranchOfficeService branchOfficeService;

    @GetMapping
    public String home(Model model){
        model.addAttribute("welcome", "Welcome to Branch Office Manager.");
        return "home";
    }

    @GetMapping("/form-create")
    public String createBranchOffice(Model model){

        BranchOfficeDto branchOfficeDto = new BranchOfficeDto();
        model.addAttribute("branchOffice", branchOfficeDto);

        return "form-create";
    }
}
