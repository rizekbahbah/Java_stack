package com.axsos.savetravels.controllers;


import com.axsos.savetravels.models.Expense;
import com.axsos.savetravels.services.ExpenseService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ExpenseController {
    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/")
    public String index(@ModelAttribute("expense") Expense expense, Model model){
        List<Expense> expenses = expenseService.allExpenses();
        model.addAttribute("expenses", expenses);
        return "index.jsp";
    }

    @PostMapping("/addExpense")
    public String addExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result){
        if(result.hasErrors()){
            return "index.jsp";
        }
        else{
            expenseService.createExpense(expense);
            return "redirect:/";
        }
    }

    @GetMapping("/edit/{id}")
    public String edit(@ModelAttribute("expense") Expense expense,
                       @PathVariable("id") Long id,
                       Model model){
        Expense expenseId = expenseService.findExpense(id);
        model.addAttribute(expenseId);
        return "edit.jsp";
    }

    @PostMapping("/updateExpense/{id}")
    public String updateExpense(@Valid @ModelAttribute("expense") Expense expense,
                                BindingResult result){
        if(result.hasErrors()){
            return "edit.jsp";
        }
        else {
            expenseService.updateExpense(expense);
            return "redirect:/";
        }
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        expenseService.deleteExpense(id);
        return "redirect:/";
    }

    @GetMapping("/expenses/{id}")
    public String info(@PathVariable("id") Long id,
                       Model model){
        Expense expense = expenseService.findExpense(id);
        model.addAttribute("expense", expense);
        return "info.jsp";
    }
}
