package com.codingdojo.ninjagold.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;


@Controller
public class GoldController {
    @GetMapping("/")
    public String index(HttpSession session){
        if(session.getAttribute("gold") == null){
            session.setAttribute("gold", 0);
            ArrayList<String> messages = new ArrayList<String>();
            session.setAttribute("messages", messages);
        }

        return "index.jsp";
    }

    @PostMapping("/earn")
    public String gold(
            @RequestParam(value = "earn") String earn,
            HttpSession session
    ){
        Date date = new Date();
        SimpleDateFormat newDate = new SimpleDateFormat("MMMM dd ,yyyy hh:mm a");
        String actionDate = newDate.format(date);

        switch (earn) {
            case "farm" -> {
                int randGold = (int) (Math.random() * 10) + 10;
                int count = (int) session.getAttribute("gold");
                session.setAttribute("gold", count + randGold);

                String message = "You worked at a Farm and earned " + randGold + " gold. (" + actionDate + ")";
                @SuppressWarnings("unchecked")
                ArrayList<String> messages = (ArrayList<String>) session.getAttribute("messages");
                messages.add(0, message);
                session.setAttribute("messages", messages);
            }
            case "cave" -> {
                int randGold = (int) (Math.random() * 5) + 5;
                int count = (int) session.getAttribute("gold");
                session.setAttribute("gold", count + randGold);

                String message = "You entered a Cave and earned " + randGold + " gold. (" + actionDate + ")";
                @SuppressWarnings("unchecked")
                ArrayList<String> messages = (ArrayList<String>) session.getAttribute("messages");
                messages.add(0, message);
                session.setAttribute("messages", messages);
            }
            case "house" -> {
                int randGold = (int) (Math.random() * 3) + 2;
                int count = (int) session.getAttribute("gold");
                session.setAttribute("gold", count + randGold);

                String message = "You entered a House and earned " + randGold + " gold. (" + actionDate + ")";
                @SuppressWarnings("unchecked")
                ArrayList<String> messages = (ArrayList<String>) session.getAttribute("messages");
                messages.add(0, message);
                session.setAttribute("messages", messages);
            }
            case "quest" -> {
                int randGold = (int) (Math.random() * 100) + -50;
                int count = (int) session.getAttribute("gold");
                session.setAttribute("gold", count + randGold);

                if (randGold > 0) {
                    String message = "You finished a Quest and earned " + randGold + " gold. (" + actionDate + ")";
                    @SuppressWarnings("unchecked")
                    ArrayList<String> messages = (ArrayList<String>) session.getAttribute("messages");
                    messages.add(0, message);
                    session.setAttribute("messages", messages);
                } else {
                    String message = "You failed a Quest and lost " + (randGold * -1) + " gold. Ouch! (" + actionDate + ")";
                    @SuppressWarnings("unchecked")
                    ArrayList<String> messages = (ArrayList<String>) session.getAttribute("messages");
                    messages.add(0, message);
                    session.setAttribute("messages", messages);
                }

            }
            case "reset" -> session.removeAttribute("gold");
        }

        return "redirect:/";
    }

}
