package scenario_based;

import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {

        double heightCm, heightInches, heightFeet;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();

        heightInches = heightCm / 2.54;
        heightFeet = heightInches / 12;

        System.out.printf(
            "Your Height in cm is %.2f while in feet is %.2f and inches is %.2f",
            heightCm, heightFeet, heightInches
        );

        input.close();
    }
}
 
