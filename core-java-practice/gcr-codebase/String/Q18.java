import java.util.*;

public class Q18 {
    static int getLength(String s) {
        int count = 0;
        try {
            while (true) s.charAt(count++);
        } catch (Exception e) {}
        return count;
    }

    static String[] customSplit(String s) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < getLength(s); i++) {
            char c = s.charAt(i);
            if (c != ' ') word.append(c);
            else if (word.length() > 0) {
                words.add(word.toString());
                word.setLength(0);
            }
        }
        if (word.length() > 0) words.add(word.toString());
        return words.toArray(new String[0]);
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] builtIn = input.split(" ");
        String[] manual = customSplit(input);
        System.out.println("Match: " + compareArrays(builtIn, manual));
    }
}
