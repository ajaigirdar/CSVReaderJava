package org.example.domain;

import java.util.Date;

public class ExpenseRecord {
    private Date date;
    private String category;
    private String description;
    private double amount;
    private String paymentMethod;

    public ExpenseRecord(Date date, String category, String description, double amount, String paymentMethod) {
        this.date = date;
        this.category = category;
        this.description = description;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Date: " + date +
                ", Category: " + category +
                ", Description: " + description +
                ", Amount: " + amount +
                ", Payment Method: " + paymentMethod;
    }
}
