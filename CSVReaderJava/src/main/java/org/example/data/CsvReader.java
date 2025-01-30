package org.example.data;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    private static final String filePath = "src/main/resources/expense_report.csv";
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public List<ExpenseRecord> readCSV() {

        List<ExpenseRecord> records = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");

                try {
                    LocalDate date = LocalDate.parse(values[0].trim(), DATE_FORMAT);
                    String category = values[1].trim();
                    String description = values[2].trim();
                    BigDecimal amount = new BigDecimal(values[3].trim());
                    String paymentMethod = values[4].trim();
                    records.add(new ExpenseRecord(date,category,description,amount,paymentMethod));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }

    public void appendToCSV(ExpenseRecord record) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(record.toCsvString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}