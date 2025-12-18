package scenario_based;

import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {

        double unitPrice, totalPrice;
        int quantity;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter unit price in INR: ");
        unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        totalPrice = unitPrice * quantity;

        System.out.printf(
            "The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f",
            totalPrice, quantity, unitPrice
        );

        input.close();
    }
}

