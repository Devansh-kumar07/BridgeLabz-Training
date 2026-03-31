import java.util.*;

public class Q17 {
    public static void main(String[] args) {
        Random r = new Random();
        String[][] data = new String[10][2];
        System.out.println("Age\tCan Vote");
        for (int i = 0; i < 10; i++) {
            int age = r.nextInt(50);
            data[i][0] = String.valueOf(age);
            data[i][1] = String.valueOf(age >= 18);
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }
}
