package com.java.site;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

        @RequestMapping(value="form", method=RequestMethod.GET)
        public String dispFirstPage(Model model) {
            model.addAttribute("msg", "Write Whatever You LIKE.");
            return "form";
        }
        
        @RequestMapping(value="form", method=RequestMethod.POST)
        public String dispNextPage(@RequestParam("val") String str, Model model) {
            model.addAttribute("msg", "You LIKE..." + str + ".");
            model.addAttribute("val", str);
            return "form";
        }
}
