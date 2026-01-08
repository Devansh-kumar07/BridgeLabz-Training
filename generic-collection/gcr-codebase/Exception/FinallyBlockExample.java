import java.util.Scanner;

public class FinallyBlockExample {
    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            result = numerator / denominator;
            System.out.println("The result is: " + result);

        } catch (ArithmeticException e) {
            System.out.println("An exception occurred: Cannot divide by zero.");
        } finally {
                System.out.println("Operation completed");
            scanner.close();
        }
    }
}