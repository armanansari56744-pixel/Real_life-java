import java.util.Scanner;

public class Curreency_Exchanger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====Cureency Exchenger====");
        System.out.println("1.  INR to USD: ");
        System.out.println("2.  USD to INR: ");
        System.out.println("3.  INR to EURO: ");
        System.out.println("4.  EURO to INR: ");

        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        double amount;
        double result;

        switch (choice) {
            case 1:
                System.out.println("Enter amount in INR: ");
                amount = sc.nextDouble();
                result = amount / 92.0;
                System.out.println("USD : " + result);
                break;

            case 2:
                System.out.println("Enter amount in USD: ");
                amount = sc.nextDouble();
                result = amount * 92.0;
                System.out.println("INR : " + result);
                break;

            case 3:
                System.out.println("Enter amount in INR: ");
                amount = sc.nextDouble();
                result = amount / 108;
                System.out.println("EURO : " + result);
                break;

            case 4:
                System.out.println("Enter amount in EURO: ");
                amount = sc.nextDouble();
                result = amount * 108;
                System.out.println("INR : " + result);
                break;

            default:
                System.out.println("Invalid choice: ");
        }
        sc.close();
    }
}
