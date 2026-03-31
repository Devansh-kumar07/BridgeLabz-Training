import java.util.Scanner;

public class Q13 {

    static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {      
  }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        int calculatedLength = getLength(input);
        int builtInLength = input.length();

        System.out.println("Calculated Length: " + calculatedLength);
        System.out.println("Built-in Length: " + builtInLength);

        sc.close();
    }
}
