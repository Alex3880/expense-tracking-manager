package com.expense.tracking.manager.service;

import com.expense.tracking.manager.model.Expense;
import com.expense.tracking.manager.persistence.ExpensesRepository;
import com.expense.tracking.manager.util.ExpenseConverter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpensesService {

    private final ExpensesRepository expensesRepository;

    public ExpensesService(ExpensesRepository expensesRepository) {
        this.expensesRepository = expensesRepository;
        System.out.println(expensesRepository.findAll());
    }

    public List<Expense> findAll() {
        return expensesRepository.findAll().stream()
                .map(ExpenseConverter::convert)
                .toList();
    }
}
