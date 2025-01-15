import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initializing account balance
        double balance = 0;
        boolean running = true;

        System.out.println("=== Welcome to Simple Banking Application ===");

        // Main menu loop
        while (running) {
            // Display menu
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            // Get user choice
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Check balance
                    System.out.println("Your current balance is: $" + balance);
                    break;

                case 2: // Deposit money
                    System.out.print("Enter deposit amount: $");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Successfully deposited: $" + deposit);
                    } else {
                        System.out.println("Invalid deposit amount. Please try again.");
                    }
                    break;

                case 3: // Withdraw money
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawal = scanner.nextDouble();
                    if (withdrawal > 0 && withdrawal <= balance) {
                        balance -= withdrawal;
                        System.out.println("Successfully withdrew: $" + withdrawal);
                    } else if (withdrawal > balance) {
                        System.out.println("Insufficient funds. Transaction failed.");
                    } else {
                        System.out.println("Invalid withdrawal amount. Please try again.");
                    }
                    break;

                case 4: // Exit program
                    System.out.println("Thank you for using the Banking Application. Goodbye!");
                    running = false;
                    break;

                default: // Invalid option
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }

        scanner.close();
    }
}
