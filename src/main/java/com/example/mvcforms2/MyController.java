package com.example.mvcforms2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String firstView() {
        return "first-view";
    }

    @RequestMapping(value = "/askEmpDetails")
    public String askEmpDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "askEmpDetails";
    }

    @RequestMapping("/viewEmpDetails")
    public String viewDetails(@ModelAttribute("employee") Employee employee) {

        return "viewEmpDetails";
    }

}
