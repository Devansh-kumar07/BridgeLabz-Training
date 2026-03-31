import java.util.*;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine(), word = "";
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0;; i++) {
            try {
                char c = text.charAt(i);
                if (c == ' ') { if (!word.isEmpty()) { words.add(word); word = ""; } }
                else word += c;
            } catch (Exception e) { if (!word.isEmpty()) words.add(word); break; }
        }

        String shortest = words.get(0), longest = words.get(0);
        for (String w : words) {
            if (w.length() < shortest.length()) shortest = w;
            if (w.length() > longest.length()) longest = w;
        }

        System.out.println("Shortest: " + shortest);
        System.out.println("Longest: " + longest);
        sc.close();
    }
}
