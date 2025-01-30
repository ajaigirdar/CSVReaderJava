package org.example.data;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ExpenseRecord {
    private LocalDate date;
    private String category;
    private String description;
    private BigDecimal amount;
    private String paymentMethod;
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");


    public ExpenseRecord(LocalDate date, String category, String description, BigDecimal amount, String paymentMethod) {
        this.date = date;
        this.category = category;
        this.description = description;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
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
        return date.format(DATE_FORMAT) + ", " +
                category + ", " +
                description + ", " +
                amount + ", " +
                paymentMethod;
    }

    public String toCsvString() {
        return date.format(DATE_FORMAT) + ", " +
                category + ", " +
                description + ", " +
                amount + ", " +
                paymentMethod;
    }
}