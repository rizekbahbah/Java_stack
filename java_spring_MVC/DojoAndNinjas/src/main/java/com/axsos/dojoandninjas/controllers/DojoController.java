package com.axsos.dojoandninjas.controllers;

import com.axsos.dojoandninjas.models.Dojo;
import com.axsos.dojoandninjas.services.DojoService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class DojoController {
    private final DojoService dojoService;

    public DojoController(DojoService dojoService) {
        this.dojoService = dojoService;
    }

    //render the Add a Dojo form
    @GetMapping("/dojos/new")
    public String dojoForm(@ModelAttribute("dojo") Dojo dojo){
        return "dojo.jsp";
    }

    @PostMapping("/addDojo")
    public String addDojo(@ModelAttribute("dojo") Dojo dojo,
                          BindingResult result){
        if(result.hasErrors()){
            return "dojo.jsp";
        }else {
            dojoService.createDojo(dojo);
            return "redirect:/ninjas/new";
        }
    }
}
