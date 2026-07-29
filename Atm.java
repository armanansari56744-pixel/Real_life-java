import java.util.Scanner;

class Bank {
    private String name;
    private int pin;
    private double balance;

    Bank(String name, int pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    public void cashDeposit(int enteredPin, double amount) {
        if (pin == enteredPin) {
            balance += amount;
            System.out.println("Cash Deposited: " + amount);
            System.out.println("Total Balance: " + balance);
        } else {
            System.out.println("Wrong PIN!");
        }
    }

    public void cashWithdraw(int enteredPin, double amount) {
        if (pin == enteredPin) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Cash Withdrawn: " + amount);
                System.out.println("Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance!");
            }
        } else {
            System.out.println("Wrong PIN!");
        }
    }

    public void checkBalance(int enteredPin) {
        if (pin == enteredPin) {
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Wrong PIN!");
        }
    }
}
public class Atm {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        Bank obj = new Bank("Arman", 5674, 500000);

        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter PIN: ");
                    int pin = sc.nextInt();

                    System.out.print("Enter Deposit Amount: ");
                    double deposit = sc.nextDouble();

                    obj.cashDeposit(pin, deposit);
                    break;

                case 2:
                    System.out.print("Enter PIN: ");
                    pin = sc.nextInt();

                    System.out.print("Enter Withdraw Amount: ");
                    double withdraw = sc.nextDouble();

                    obj.cashWithdraw(pin, withdraw);
                    break;

                case 3:
                    System.out.print("Enter PIN: ");
                    pin = sc.nextInt();

                    obj.checkBalance(pin);
                    break;

                case 4:
                    System.out.println("Thank you for using our Bank!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
