package org.example.JavaOOps;
import java.util.Scanner;

public class BankingATM {
    private static double accountBalance = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Credit Entries");
            System.out.println("2. Debit Entries");
            System.out.println("3. Account Balance");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    creditEntries(scanner);
                    break;
                case 2:
                    debitEntries(scanner);
                    break;
                case 3:
                    displayAccountBalance();
                    break;
                case 4:
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
    private static void creditEntries(Scanner scanner) {
        System.out.print("Enter the number of credit entries: ");
        int numCredits = scanner.nextInt();

        for (int i = 0; i < numCredits; i++) {
            System.out.print("Enter credit value for entry " + (i + 1) + ": ");
            double creditValue = scanner.nextDouble();
            accountBalance += creditValue;
        }

        System.out.println("Credit entries processed. Current account balance: " + accountBalance);
    }

    private static void debitEntries(Scanner scanner) {
        System.out.print("Enter the number of debit entries: ");
        int numDebits = scanner.nextInt();
        for (int i = 0; i < numDebits; i++) {
            System.out.print("Enter debit value for entry " + (i + 1) + ": ");
            double debitValue = scanner.nextDouble();

            if (accountBalance - debitValue < 0) {
                System.out.println("Debit cannot be processed. Insufficient funds.");
                return;
            }
            accountBalance -= debitValue;
        }
        System.out.println("Debit entries processed. Current account balance: " + accountBalance);
    }

    private static void displayAccountBalance() {
        System.out.println("Current account balance: " + accountBalance);
    }
}


