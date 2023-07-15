package cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home(Model model){
        model.addAttribute("welcome", "Welcome to Branch Office Manager.");
        return "home";
    }
}
