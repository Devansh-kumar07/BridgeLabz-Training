package String;

import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        System.out.println("\nGenerating IllegalArgumentException:");
        // Method that generates exception (not handled)
        generateException(text);

        System.out.println("\nHandling IllegalArgumentException:");
        // Method that handles exception using try-catch
        handleException(text);
    }

    // Method to generate IllegalArgumentException
    static void generateException(String text) {
        int startIndex = 5;
        int endIndex = 2;

        // This will generate IllegalArgumentException
        String result = text.substring(startIndex, endIndex);
        System.out.println("Substring result: " + result);
    }

    // Method to handle IllegalArgumentException
    static void handleException(String text) {
        int startIndex = 5;
        int endIndex = 2;

        try {
            String result = text.substring(startIndex, endIndex);
            System.out.println("Substring result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
            System.out.println("Reason: Start index is greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
            System.out.println("Message: " + e.getMessage());
        }
    }
}
