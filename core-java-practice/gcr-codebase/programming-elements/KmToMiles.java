package scenario_based;
import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {

        double km, miles;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        miles = km / 1.6;

        System.out.printf(
            "The total miles is %.2f mile for the given %.2f km",
            miles, km
        );

        input.close();
    }
}
