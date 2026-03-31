package scenario_based;

import java.util.Scanner;

public class FeetToYardMile {
    public static void main(String[] args) {

        double distanceInFeet, distanceInYards, distanceInMiles;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        distanceInFeet = input.nextDouble();

        distanceInYards = distanceInFeet / 3;
        distanceInMiles = distanceInYards / 1760;

        System.out.printf(
            "The distance in feet is %.2f while in yards is %.2f and miles is %.4f",
            distanceInFeet, distanceInYards, distanceInMiles
        );

       
    }
}

