package phase1;

import java.util.Scanner;

public class BankingProgram {

    // Static scanner shared across all methods
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {

            System.out.println("***************");
            System.out.println("BANKING PROGRAM!");
            System.out.println("***************");
            System.out.println("1. Show My Balance");
            System.out.println("2. Make a Deposit");
            System.out.println("3. Make a Withdrawal");
            System.out.println("4. Exit");
            System.out.println("***************");

            System.out.print("Enter Your Choice(1-4): ");
            choice = scanner.nextInt();

            // Route user choice to the correct method
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Please Make a Valid Choice!");
            }
        }

        System.out.println("Thank you for banking with Chase. Have a nice day!");
        scanner.close();
    }

    // Display current balance
    static void showBalance(double balance) {
        System.out.println("***************");
        System.out.printf("$%.2f%n", balance);
        System.out.println("***************");
    }

    // Handle deposit — returns amount or 0 if invalid
    static double deposit() {
        double amount;

        System.out.print("Enter an amount to deposit: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative!");
            return 0;
        } else {
            return amount;
        }
    }

    // Handle withdrawal — validates against current balance
    static double withdraw(double balance) {
        double amount;

        System.out.print("Enter an amount to withdraw: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient Funds!!!");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative!");
            return 0;
        } else {
            return amount;
        }
    }
}