package com.axsos.dojoandninjas.controllers;


import com.axsos.dojoandninjas.models.Dojo;
import com.axsos.dojoandninjas.models.Ninja;
import com.axsos.dojoandninjas.services.DojoService;
import com.axsos.dojoandninjas.services.NinjaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class NinjaController {
    private final NinjaService ninjaService;
    private final DojoService dojoService;

    public NinjaController(NinjaService ninjaService, DojoService dojoService) {
        this.ninjaService = ninjaService;
        this.dojoService = dojoService;
    }

    @GetMapping("/ninjas/new")
    public String ninjaForm(@ModelAttribute("ninja") Ninja ninja,
                            Model model){
        List<Dojo> dojos = dojoService.allDojos();
        model.addAttribute("dojos", dojos);
        return "ninja.jsp";
    }

    @PostMapping("/addNinja")
    public String addNinja(@ModelAttribute("ninja") Ninja ninja,
                           BindingResult result){
        if(result.hasErrors()){
            return "ninja.jsp";
        }else {
            ninjaService.createNinja(ninja);
            return "redirect:/";
        }
    }
}
