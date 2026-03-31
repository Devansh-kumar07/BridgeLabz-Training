package scenario_based_real_wala;

import java.util.Scanner;

public class FlipKeyLogicalProblem {

    public static String CleanseAndInvert(String input) {

        // Rule 1: null or length < 6
        if (input == null || input.length() < 6) {
            return "";
        }

        // Rule 2: must contain only alphabets (no space, digit, special char)
        for (char c : input.toCharArray()) {
            if (!Character.isLetter(c)) {
                return "";
            }
        }

        // Convert to lowercase
        input = input.toLowerCase();

        // Remove characters with even ASCII values
        StringBuilder filtered = new StringBuilder();
        for (char c : input.toCharArray()) {
            if ((int) c % 2 != 0) {   // keep odd ASCII
                filtered.append(c);
            }
        }

        // Reverse the string
        filtered.reverse();

        // Convert even index characters to uppercase
        for (int i = 0; i < filtered.length(); i++) {
            if (i % 2 == 0) {
                filtered.setCharAt(i, Character.toUpperCase(filtered.charAt(i)));
            }
        }

        return filtered.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string:");
        String input = sc.nextLine();

        String result = CleanseAndInvert(input);

        if (result.isEmpty()) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("The generated key is - " + result);
        }

        sc.close();
    }
}
