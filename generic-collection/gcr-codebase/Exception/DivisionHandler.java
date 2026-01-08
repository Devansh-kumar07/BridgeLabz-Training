import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionHandler {
    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter a number to divide: ");
                numerator = scanner.nextInt();
                System.out.print("Enter a number to divide by: ");
                denominator = scanner.nextInt();
                int result = numerator / denominator;
                System.out.println("Result: " + result);
                validInput = true;

            } catch (ArithmeticException e) {
                 System.out.println("Cannot divide by zero!");

            } catch (InputMismatchException e) {
                 System.out.println("Invalid input: Please enter a numeric value.");
                scanner.nextLine(); 

            }
        }
        scanner.close();
    }
}