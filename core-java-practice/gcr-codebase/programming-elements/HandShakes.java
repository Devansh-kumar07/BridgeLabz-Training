package scenario_based;

import java.util.Scanner;

public class HandShakes {
    public static void main(String[] args) {

        int numberOfStudents;
        int handshakes;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        numberOfStudents = sc.nextInt();

        handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println(
            "The maximum number of handshakes possible is " + handshakes
        );

        sc.close();
    }
}
