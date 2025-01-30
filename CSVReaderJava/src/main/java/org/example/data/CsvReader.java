package org.example.data;

import org.example.domain.ExpenseRecord;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsvReader {
    private static final String filePath = "src/main/resources/expense_report.csv";
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public List<ExpenseRecord> readCSV() {

        List<ExpenseRecord> records = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");

                try {
                    Date date = DATE_FORMAT.parse(values[0]);
                    String category = values[1];
                    String description = values[2];
                    double amount = Double.parseDouble(values[3]);
                    String paymentMethod = values[4];
                    records.add(new ExpenseRecord(date,category,description,amount,paymentMethod));
                } catch (ParseException | NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }
}