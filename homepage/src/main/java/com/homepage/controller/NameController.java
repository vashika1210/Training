package com.homepage.controller;

import com.homepage.model.NameList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("nameList")
public class NameController {

    @ModelAttribute("nameList")
    public NameList createNameList() {
        return new NameList();
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/register")
    public String registerName(@RequestParam("name") String name,
                                @ModelAttribute("nameList") NameList nameList,
                                Model model) {
        nameList.addName(name);
        model.addAttribute("registeredNames", nameList.getNames());
        return "index";
    }
}
