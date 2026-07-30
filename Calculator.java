
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====Calculator====");
        System.out.println("1  Addition: ");
        System.out.println("2  Subtraction: ");
        System.out.println("3  Multiplication: ");
        System.out.println("4  Division: ");

        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        int firstNumber, secondNumber;
        int result;

        switch (choice) {
            case 1:
                System.out.println("enter first number: ");
                firstNumber = sc.nextInt();
                System.out.println("Enter second number: ");
                secondNumber = sc.nextInt();
                result = firstNumber + secondNumber;
                System.out.println("Addition : " + result);
                break;

            case 2:
                System.out.println("Enter first number: ");
                firstNumber = sc.nextInt();
                System.out.println("Enter second number: ");
                secondNumber = sc.nextInt();
                result = firstNumber - secondNumber;
                System.out.println("Subtraction: " + result);
                if(secondNumber > firstNumber){
                    System.out.println("Invalid Input: ");
                }
                break;

            case 3:
                System.out.println("Enter first number: ");
                firstNumber = sc.nextInt();
                System.out.println("Enter second number: ");
                secondNumber = sc.nextInt();
                result = firstNumber * secondNumber;
                System.out.println("Multiplication : " + result);
                break;

            case 4:
                System.out.println("Enter first number: ");
                firstNumber = sc.nextInt();
                System.out.println("Enter second number: ");
                secondNumber = sc.nextInt();
                result = firstNumber / secondNumber;
                System.out.println("Division : " + result);

                if (secondNumber > firstNumber) {
                    System.out.println("Invalide input: ");
                }
                break;

            default:
                System.out.println("Invalid option: ");
        }

    }
}