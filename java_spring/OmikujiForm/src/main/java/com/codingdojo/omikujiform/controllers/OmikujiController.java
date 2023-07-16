package com.codingdojo.omikujiform.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiController {
    @GetMapping("/omikuji")
    public String index(){
        return "index.jsp";
    }

    @PostMapping("/send")
    public String form(
            @RequestParam(value = "number")  String number,
            @RequestParam(value = "city")  String city,
            @RequestParam(value = "name")  String name,
            @RequestParam(value = "hobby")  String hobby,
            @RequestParam(value = "animal")  String animal,
            @RequestParam(value = "something")  String something,
            HttpSession session
    ){
        session.setAttribute("number", number);
        session.setAttribute("city", city);
        session.setAttribute("name", name);
        session.setAttribute("hobby", hobby);
        session.setAttribute("animal", animal);
        session.setAttribute("something", something);
        return "redirect:/omikuji/show";
    }

    @GetMapping("/omikuji/show")
    public String result(){
        return "result.jsp";
    }
}
