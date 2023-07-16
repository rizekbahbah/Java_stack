package com.axsos.displaydate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index.jsp";
    }
    @RequestMapping("/date")
    public String date(Model model){
        LocalDate myDate = LocalDate.now();
        model.addAttribute("date", myDate);
        return "date.jsp";
    }
    @RequestMapping("/time")
    public String time(Model model){
        LocalTime myTime = LocalTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedTime = myTime.format(myFormatObj);
        model.addAttribute("time", formattedTime);
        return "time.jsp";
    }
}
