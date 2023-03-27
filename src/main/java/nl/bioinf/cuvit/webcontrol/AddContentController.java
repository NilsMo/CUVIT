package nl.bioinf.cuvit.webcontrol;
/* Author: Nils Mooldijk */

import nl.bioinf.cuvit.models.CurriculumModule;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddContentController {

    @GetMapping("/addContent")
    public String moduleForm(Model model) {
        model.addAttribute("curriculumModule", new CurriculumModule());
        return "greeting";
    }

    @PostMapping("/addContent")
    public String greetingSubmit(@ModelAttribute CurriculumModule module, Model model) {
        model.addAttribute("curriculumModule", module);
        return "result";
    }

}
