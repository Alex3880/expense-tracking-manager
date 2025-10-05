package com.expense.tracking.manager.api;

import com.expense.tracking.manager.model.Expense;
import com.expense.tracking.manager.service.ExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/expenses")
public class ExpensesRestController {

    private final ExpensesService expensesService;

    @Autowired
    public ExpensesRestController(ExpensesService expensesService) {
        this.expensesService = expensesService;
    }

    @GetMapping
    public List<Expense> getAllExpenses() {
        return expensesService.findAll();
    }
}
