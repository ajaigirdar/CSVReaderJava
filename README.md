# Expense Report CSV Reader 📄

This Java application reads an expense report CSV file and displays the information in the console. It is also capable of adding new records to the CSV file.
The program follows a 3-layer architecture: data, domain, and UI layers.

## Features

1. **Display All Records**: Reads all records from the CSV file and displays them in the console.
2. **Display Records by Category**: Filters and displays records based on the given category.

## Project Structure
- ` Main: ` The main entry point of the application.

- ` data package: `
 
  - ` CsvReader: ` Reads and writes data from the CSV file and converts it into ExpenseRecord objects.
    
  - ` ExpenseRecord: ` Represents individual expense records with fields for date, category, description, amount, and payment method.

- ` domain package: `

  - ` ExpenseService: ` Contains the business logic for filtering and retrieving expense records.

- ` ui package: `

  - ` ConsoleUI: ` Handles displaying records to the console.
