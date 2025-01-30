package org.example.domain;

import org.example.data.CsvReader;
import org.example.data.ExpenseRecord;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ExpenseService {
    private final CsvReader csvReader;
    private final List<ExpenseRecord> expenseRecords;

    public ExpenseService() {
        this.csvReader = new CsvReader();
        this.expenseRecords = new ArrayList<>(csvReader.readCSV());
    }

    public List<ExpenseRecord> getAllRecords() {
        return csvReader.readCSV();
    }

    public List<ExpenseRecord> getRecordsByCategory(String category) {
        List<ExpenseRecord> filteredRecords = new ArrayList<>();

        for (ExpenseRecord record : csvReader.readCSV()) {
            if (record.getCategory().contains(category)) {
                filteredRecords.add(record);
            }
        }
        return filteredRecords;
    }

    public void addExpenseRecord(LocalDate date, String category, String description, BigDecimal amount, String paymentMethod) {
        ExpenseRecord newRecord = new ExpenseRecord(date, category, description,amount, paymentMethod);
        expenseRecords.add(newRecord);
        csvReader.writeCSV(expenseRecords);
    }

}