import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] scores = new int[n][3];
        double[][] stats = new double[n][3];
        String[] grades = new String[n];
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            int t = 0;
            for (int j = 0; j < 3; j++) {
                scores[i][j] = r.nextInt(41) + 60;
                t += scores[i][j];
            }
            double avg = t / 3.0, perc = t / 3.0;
            stats[i][0] = t;
            stats[i][1] = Math.round(avg * 100) / 100.0;
            stats[i][2] = Math.round((t / 300.0) * 10000) / 100.0;
            double p = stats[i][2];
            grades[i] = p >= 90 ? "A" : p >= 80 ? "B" : p >= 70 ? "C" : p >= 60 ? "D" : "F";
        }

        System.out.printf("%-8s%-9s%-9s%-9s%-7s%-7s%-7s%-6s%n", "Student", "Physics", "Chem", "Maths", "Total", "Avg", "%", "Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("S%-7d%-9d%-9d%-9d%-7.0f%-7.2f%-7.2f%-6s%n", i + 1,
                    scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
        sc.close();
    }
}
