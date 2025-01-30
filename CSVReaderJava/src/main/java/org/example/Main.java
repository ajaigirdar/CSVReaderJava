package org.example;

import org.example.domain.ExpenseService;
import org.example.ui.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        ExpenseService expenseService = new ExpenseService();

        ConsoleUI ui = new ConsoleUI(expenseService);

        ui.run();
    }
}