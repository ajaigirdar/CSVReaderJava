package org.example;

import org.example.domain.ExpenseService;
import org.example.ui.ConsoleUI;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ExpenseService expenseService = new ExpenseService();

        expenseService.addExpenseRecord(
                LocalDate.of(2025, 1, 30),
                "Office Supplies",
                "Printer paper",
                new BigDecimal("8.99"),
                "Company Card"
        );
        ConsoleUI ui = new ConsoleUI(expenseService);

        ui.run();
    }
}