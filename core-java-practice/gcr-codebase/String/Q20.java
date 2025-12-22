import java.util.*;

public class Q20 {

    static int[] trimSpaces(String s) {
        int start = 0, end = 0, len = 0;
        try {
            while (true) s.charAt(len++);
        } catch (Exception e) {}
        end = len - 1;

        while (start < len && s.charAt(start) == ' ') start++;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        return new int[]{start, end + 1}; // end +1 for substring compatibility
    }

    static String subStringByCharAt(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    static boolean compareStrings(String a, String b) {
        if (a == null || b == null) return false;
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] bounds = trimSpaces(input);
        String trimmedManual = subStringByCharAt(input, bounds[0], bounds[1]);
        String trimmedBuiltIn = input.trim();
        System.out.println("Manual Trim: '" + trimmedManual + "'");
        System.out.println("Built-in Trim: '" + trimmedBuiltIn + "'");
        System.out.println("Match: " + compareStrings(trimmedManual, trimmedBuiltIn));
    }
}
