package nl.bioinf.cuvit.webcontrol;
/* Author: Nils Mooldijk */

import nl.bioinf.cuvit.models.ContentTestModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class ContentTestController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("contentTest", new ContentTestModel());
        return "contentTest";
    }

    @PostMapping("/contentTest")
    public String greetingSubmit(@ModelAttribute ContentTestModel contentTest, Model model) {
        model.addAttribute("contentTest", contentTest);
        return "result";
    }

}
