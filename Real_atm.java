import java.util.Scanner;

public class Real_atm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pin =5674;
        System.out.println("Enter Atm pin: ");
        int enteredPin = sc.nextInt();

        if(enteredPin != pin){
            System.out.println("Entered Invalid pin: ");
            sc.close();
            return;
        }
        

        System.out.println("=====ATM=====");
        System.out.println("1 Check balance: ");
        System.out.println("2 Withdraw cash: ");
        System.out.println("3 deposite cash: ");
        System.out.println("4 Exit: ");

        int choice = sc.nextInt();
        double balance = 500000;


        switch (choice) {
            case 1:
                System.out.println("your bank balance: " + balance);
                break;

            case 2:
                System.out.println("Enter your withdraw ammount: ");
                double withdraw = sc.nextDouble();
                if (withdraw > balance) {
                    System.out.println("Insufficient balance: ");
                } else {
                    balance = balance - withdraw;
                    System.out.println("cash withdraw sucessfully: ");
                    System.out.println("remain balance :" + balance);
                }
                break;
            case 3:
                System.out.println("Enter your deposite ammount: ");
                double deposit = sc.nextDouble();
                balance = balance + deposit;
                System.out.println("cash deposite sucessfully: ");
                System.out.println("total balance : " + balance);

                break;
            case 4:
                System.out.println("Thank you for banking for us: ");
                break;
        }
        sc.close();
    }
}
