package com.axsos.savetravels.services;

import com.axsos.savetravels.models.Expense;
import com.axsos.savetravels.repositories.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public Expense createExpense(Expense expense){
        return expenseRepository.save(expense);
    }

    public List<Expense> allExpenses(){
        return expenseRepository.findAll();
    }

    public Expense findExpense(Long id){
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if(optionalExpense.isPresent()){
            return optionalExpense.get();
        }
        else {
            return null;
        }
    }

    //update expenses
    public Expense updateExpense(Expense expense){
        return expenseRepository.save(expense);
    }

    public void deleteExpense(Long id){
        expenseRepository.deleteById(id);
    }
}
