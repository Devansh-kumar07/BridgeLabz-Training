import java.util.Scanner;

public class Q14 {

    static String checkType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] classifyCharacters(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkType(text.charAt(i));
        }
        return result;
    }

    static void displayTable(String[][] data) {
        System.out.printf("%-10s%-15s%n", "Character", "Type");
        System.out.println("-----------------------");
        for (String[] row : data) {
            System.out.printf("%-10s%-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = classifyCharacters(input);
        displayTable(result);

        sc.close();
    }
}
