package scenario_based;

import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {

        double fee, discountPercent, discountAmount, finalFee;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student fee in INR: ");
        fee = input.nextDouble();

        System.out.print("Enter the university discount percentage: ");
        discountPercent = input.nextDouble();

        discountAmount = (fee * discountPercent) / 100;
        finalFee = fee - discountAmount;

        System.out.printf(
            "The discount amount is INR %.2f and final discounted fee is INR %.2f",
            discountAmount, finalFee
        );

        input.close();
    }
}

