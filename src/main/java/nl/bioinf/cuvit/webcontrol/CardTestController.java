package nl.bioinf.cuvit.webcontrol;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/* Author: Nils Mooldijk */

@Controller
public class CardTestController {

    @GetMapping("/cardtest")
    public String cardModel(Model model) {
        model.addAttribute("title", "Bio-Informatica");
        model.addAttribute("short_description","This subject teaches the general skills for bio-informatics.");
        model.addAttribute("long_description", "Bio-informatics focuses on the methods and techniques used by bio-informatics around the world." +
                "The theory and methods of how data is extracted from DNA, their pros and cons and the techniques used to " +
                "understand the data.");
        return "cardtest";
    }
}
