package org.example.domain;

import org.example.data.CsvReader;
import org.example.data.ExpenseRecord;

import java.util.ArrayList;
import java.util.List;

public class ExpenseService {
    private final CsvReader csvReader;

    public ExpenseService() {
        this.csvReader = new CsvReader();
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
}
