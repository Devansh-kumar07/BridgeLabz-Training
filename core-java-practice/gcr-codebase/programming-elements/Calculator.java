package scenario_based;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double num1, num2;
        double addition, subtraction, multiplication, division;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        addition = num1 + num2;
        subtraction = num1 - num2;
        multiplication = num1 * num2;
        division = num1 / num2;

        System.out.printf(
            "The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f",
            num1, num2, addition, subtraction, multiplication, division
        );

        input.close();
    }
}

