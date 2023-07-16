package com.codingdojo.counter.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CounterController {
    //increment visit by 1
    @RequestMapping("/")
    public String index(HttpSession session) {
        if (session.getAttribute("count") == null) {
            session.setAttribute("count", 0);
        }
        else {
            int count = (int) session.getAttribute("count");
            session.setAttribute("count", count + 1);
        }

        return "index.jsp";
    }

    //increment visit by 2
    @RequestMapping("/two")
    public String index2(HttpSession session) {
        if (session.getAttribute("count") == null) {
            session.setAttribute("count", 0);
        }
        else {
            int count = (int) session.getAttribute("count");
            session.setAttribute("count", count + 2);
        }

        return "index2.jsp";
    }

    @RequestMapping("/reset")
    public String reset(HttpSession session){
        session.removeAttribute("count");
        return "index.jsp";
    }

    @RequestMapping("/counter")
    public String counter(){
        return "counter.jsp";
    }
}
