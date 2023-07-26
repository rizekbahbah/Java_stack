package com.axsos.dojoandninjas.controllers;


import com.axsos.dojoandninjas.models.Dojo;
import com.axsos.dojoandninjas.models.Ninja;
import com.axsos.dojoandninjas.services.DojoService;
import com.axsos.dojoandninjas.services.NinjaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class MainController {
    private final DojoService dojoService;
    private final NinjaService ninjaService;

    public MainController(DojoService dojoService, NinjaService ninjaService) {
        this.dojoService = dojoService;
        this.ninjaService = ninjaService;
    }


    @GetMapping("/")
    public String info(Model model){
        List<Dojo> dojos = dojoService.allDojos();
        List<Ninja> ninjas = ninjaService.allNinjas();
        model.addAttribute("dojos", dojos);
        model.addAttribute("ninjas", ninjas);

        return "index.jsp";
    }
}
