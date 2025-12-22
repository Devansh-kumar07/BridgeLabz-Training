import java.util.*;

public class Q19 {

    static int strLength(String s) {
        int count = 0;
        try {
            while (true) s.charAt(count++);
        } catch (Exception e) {}
        return count;
    }

    static String[] splitWords(String s) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < strLength(s); i++) {
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

    static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(strLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = splitWords(input);
        String[][] wordData = getWordLengths(words);
        System.out.println("Word\tLength");
        for (String[] row : wordData) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}
