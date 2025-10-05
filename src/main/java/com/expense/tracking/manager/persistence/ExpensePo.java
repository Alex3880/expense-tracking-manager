package com.expense.tracking.manager.persistence;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "expenses")
public class ExpensePo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;
    private Double amount;
    private String category;

    public Long getId() {
        return id;
    }

    public ExpensePo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ExpensePo setDescription(String description) {
        this.description = description;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public ExpensePo setAmount(Double amount) {
        this.amount = amount;
        return this;
    }



    public String getCategory() {
        return category;
    }

    public ExpensePo setCategory(String category) {
        this.category = category;
        return this;
    }

    @Override
    public String toString() {
        String sb = "ExpensePo{" + "id=" + id +
                    ", description='" + description + '\'' +
                    ", amount=" + amount +
                    ", category='" + category + '\'' +
                    '}';
        return sb;
    }
}
