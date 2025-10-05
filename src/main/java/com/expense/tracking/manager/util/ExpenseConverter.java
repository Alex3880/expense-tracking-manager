package com.expense.tracking.manager.util;

import com.expense.tracking.manager.model.Expense;
import com.expense.tracking.manager.persistence.ExpensePo;

public final class ExpenseConverter {

    public static Expense convert(ExpensePo po) {
        Expense expense = new Expense();
        expense.setId(po.getId());
        expense.setDescription(po.getDescription());
        expense.setAmount(po.getAmount());
        expense.setCategory(po.getCategory());
        return expense;
    }
}
