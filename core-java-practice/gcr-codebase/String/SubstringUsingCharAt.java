package String;
import java.util.Scanner;

public class SubstringUsingCharAt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a string: ");
        String text = sc.next();
        
        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Create substring using charAt()
        String manualSubstring = createSubstringUsingCharAt(text, start, end);

        // Create substring using built-in method
        String builtInSubstring = text.substring(start, end);

        // Compare both substrings
        boolean result = compareStringsUsingCharAt(manualSubstring, builtInSubstring);

        System.out.println("\nSubstring using charAt(): " + manualSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Are both substrings equal? " + result);

        sc.close();
    }

    // Method to create substring using charAt()
    public static String createSubstringUsingCharAt(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

 // Method to compare 
    public static boolean compareStringsUsingCharAt(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
