package com.expense.tracking.manager.model;

import java.util.Date;

public class Expense {

    private Long id;
    private String description;
    private Double amount;
    private String category;

    public Long getId() {
        return id;
    }

    public Expense setId(Long id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Expense setDescription(String description) {
        this.description = description;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public Expense setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Expense setCategory(String category) {
        this.category = category;
        return this;
    }

    @Override
    public String toString() {
        return "Expense{" + "id=" + id +
               ", description='" + description + '\'' +
               ", amount=" + amount +
               ", category='" + category + '\'' +
               '}';
    }
}
