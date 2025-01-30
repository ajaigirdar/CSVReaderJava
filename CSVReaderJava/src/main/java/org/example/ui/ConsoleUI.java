package org.example.ui;

import org.example.domain.ExpenseRecord;
import org.example.domain.ExpenseService;

import java.util.List;

public class ConsoleUI {

    private final ExpenseService expenseService;

    public ConsoleUI() {
        this.expenseService = new ExpenseService();
    }

//    public void displayAllRecord() {
//        List<ExpenseRecord> records = expenseService.getAllRecords();
//        System.out.println("-- All Records --");
//
//        for (ExpenseRecord record : records){
//            System.out.println(record);
//        }
//    }

    public void displayAllRecords() {
        List<ExpenseRecord> records = expenseService.getAllRecords();
        System.out.println("All Records:");
        for (ExpenseRecord record : records) {
            System.out.println(record);
        }
    }

    public void displayRecordsByCategory() {

    }
    public void run() {
//        System.out.println("-- display file by category --");
        displayAllRecords();

//        displayRecordsByCategory();
    }
}
