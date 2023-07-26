package com.axsos.burgertracker1.controllers;

import com.axsos.burgertracker1.models.Burger;
import com.axsos.burgertracker1.services.BurgerService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class BurgerController {
    public final BurgerService burgerService;

    public BurgerController(BurgerService burgerService) {
        this.burgerService = burgerService;
    }

    @GetMapping("/")
    public String index(@ModelAttribute("burger") Burger burger, Model model){
        List<Burger> burgers = burgerService.allBurgers();
        model.addAttribute("burgers", burgers);
        return "index.jsp";
    }

    @PostMapping("/addBurger")
    public String addBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result){
        if(result.hasErrors()){
            return "index.jsp";
        }
        else {
            burgerService.createBurger(burger);
            return "redirect:/";
        }
    }

    @GetMapping("/edit/{id}")
    public String edit(@ModelAttribute("burger") Burger burger,
                       @PathVariable("id") Long id,
                       Model model){
        Burger burgerId  = burgerService.findBurger(id);
        model.addAttribute("burger", burgerId);
        return "edit.jsp";
    }

    @PostMapping("/updateBurger/{id}")
    public String updateBurger(@Valid @ModelAttribute("burger") Burger burger,
                               BindingResult result){
        if(result.hasErrors()){
            return "edit.jsp";
        }
        else {
            burgerService.updateBurger(burger);
            return "redirect:/";
        }
    }
}
