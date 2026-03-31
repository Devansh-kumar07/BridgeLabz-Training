package String;

import java.util.Scanner;

public class NumberFormatDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value:");
        String text = sc.nextLine();

        System.out.println("\nGenerating NumberFormatException:");
        generateException(text);

        System.out.println("\nHandling NumberFormatException:");
        handleException(text);
    }

    // Method to generate NumberFormatException
    static void generateException(String text) {
        int number = Integer.parseInt(text); // Exception here
        System.out.println("Extracted number: " + number);
    }

    // Method to handle NumberFormatException
    static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Extracted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
            System.out.println("Reason: Input does not contain valid digits.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
        }
    }
}
