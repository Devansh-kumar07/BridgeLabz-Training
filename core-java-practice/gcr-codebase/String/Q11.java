import java.util.Scanner;

public class Q11 {

    static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        return switch (choice) {
            case 0 -> "rock";
            case 1 -> "paper";
            default -> "scissors";
        };
    }

    static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) {
            return "User";
        }
        return "Computer";
    }

    static String[][] getResultsTable(String[] userChoices, String[] compChoices, String[] winners, int totalGames) {
        int userWins = 0, compWins = 0;
        String[][] table = new String[totalGames + 2][4];
        table[0][0] = "Game"; table[0][1] = "User"; table[0][2] = "Computer"; table[0][3] = "Winner";

        for (int i = 0; i < totalGames; i++) {
            table[i + 1][0] = String.valueOf(i + 1);
            table[i + 1][1] = userChoices[i];
            table[i + 1][2] = compChoices[i];
            table[i + 1][3] = winners[i];

            if (winners[i].equals("User")) userWins++;
            else if (winners[i].equals("Computer")) compWins++;
        }

        table[totalGames + 1][0] = "Total %";
        table[totalGames + 1][1] = String.format("%.2f%%", (userWins * 100.0) / totalGames);
        table[totalGames + 1][2] = String.format("%.2f%%", (compWins * 100.0) / totalGames);
        table[totalGames + 1][3] = "Draws: " + (totalGames - userWins - compWins);

        return table;
    }

    static void displayResults(String[][] table) {
        for (String[] row : table) {
            for (String cell : row) {
                System.out.printf("%-15s", cell);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int totalGames = sc.nextInt();

        String[] userChoices = new String[totalGames];
        String[] compChoices = new String[totalGames];
        String[] winners = new String[totalGames];

        for (int i = 0; i < totalGames; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            userChoices[i] = sc.next().toLowerCase();
            compChoices[i] = getComputerChoice();
            winners[i] = findWinner(userChoices[i], compChoices[i]);
        }

        String[][] table = getResultsTable(userChoices, compChoices, winners, totalGames);
        displayResults(table);

        sc.close();
    }
}
