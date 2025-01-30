package org.example.ui;

import org.example.data.ExpenseRecord;
import org.example.domain.ExpenseService;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class ConsoleUI {

    private final ExpenseService expenseService;
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");


    public ConsoleUI(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

public void displayAllRecords() {
    List<ExpenseRecord> records = expenseService.getAllRecords();
    System.out.println("[ All Records ]");
    System.out.printf("%-11s %-15s %-20s %-8s %-20s%n",
            "Date",
            "Category",
            "Description",
            "Amount",
            "Payment Method");
    for (ExpenseRecord record : records) {
        System.out.printf("%-11s %-15s %-20s %-8s %-20s%n",
                DATE_FORMAT.format(record.getDate()),
                record.getCategory(),
                record.getDescription(),
                record.getAmount(),
                record.getPaymentMethod());
    }
    System.out.println("-----------------------------------------------------------------------------");
}

    public void displayRecordsByCategory(String category) {
        List<ExpenseRecord> records = expenseService.getRecordsByCategory(category);
        System.out.println("[ Records For " + category + " Category ]");
        System.out.printf("%-11s %-15s %-20s %-8s %-20s%n",
                "Date",
                "Category",
                "Description",
                "Amount",
                "Payment Method");
        for (ExpenseRecord record : records) {
            System.out.printf("%-11s %-15s %-20s %-8s %-20s%n",
                    DATE_FORMAT.format(record.getDate()),
                    record.getCategory(),
                    record.getDescription(),
                    record.getAmount(),
                    record.getPaymentMethod());
        }
        System.out.println("-----------------------------------------------------------------------------");
    }


    public void run() {
        displayAllRecords();

        displayRecordsByCategory("Travel");

        displayRecordsByCategory("Office Supplies");

        displayRecordsByCategory("Meals");

        displayRecordsByCategory("Entertainment");

        displayRecordsByCategory("Utilities");
    }
}
