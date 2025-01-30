package org.example.ui;

import org.example.domain.ExpenseRecord;
import org.example.domain.ExpenseService;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ConsoleUI {

    private final ExpenseService expenseService;
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");


    public ConsoleUI() {
        this.expenseService = new ExpenseService();
    }

public void displayAllRecords() {
    List<ExpenseRecord> records = expenseService.getAllRecords();
    System.out.println("-- All Records --");
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

    }

    public void run() {
        displayAllRecords();

    }
}
