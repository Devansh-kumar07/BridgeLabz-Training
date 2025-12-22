package String;

import java.util.Scanner;

public class ArrayIndexDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Dev", "Amit", "Ravi"};

        System.out.println("Enter index value:");
        int index = sc.nextInt();

        System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");
        generateException(names, index);

        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleException(names, index);
    }

    // Method to generate exception
    static void generateException(String[] names, int index) {
        System.out.println("Name: " + names[index]); // Exception here
    }

    // Method to handle exception
    static void handleException(String[] names, int index) {
        try {
            System.out.println("Name: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println("Reason: Index is outside array length.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
        }
    }
}
