package org.example.domain;

import org.example.data.CsvReader;

import java.util.List;

public class ExpenseService {
    private final CsvReader csvReader;

    public ExpenseService() {
        this.csvReader = new CsvReader();
    }

    public List<ExpenseRecord> getAllRecords() {
        return null;
    }

    public List<ExpenseRecord> getRecordsByCategory(String category) {
        return null;
    }
}
