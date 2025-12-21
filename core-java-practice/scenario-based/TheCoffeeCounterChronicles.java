package scenario_based_real_wala;
import java.util.Scanner;

public class TheCoffeeCounterChronicles {

    static final double GST_RATE = 0.18;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nPlease select the type of coffee by pressing 1, 2 or 3...");
            System.out.println("1. Mocha  2. Classic  3. Ravi Special");

            int coffeeNum = sc.nextInt();

            if (coffeeNum < 1 || coffeeNum > 3) {
                System.out.println("❌ Invalid coffee selection");
                continue;
            }

            int basePrice = coffeePrice(coffeeNum, sc);

            if (basePrice == 0) {
                System.out.println("❌ Invalid quantity selection");
                continue;
            }

            double gstAmount = basePrice * GST_RATE;
            double totalAmount = basePrice + gstAmount;

            printBill(coffeeNum, basePrice, gstAmount, totalAmount);

            System.out.println("\nType 'exit' to stop or press Enter for next customer:");
            sc.nextLine(); // consume leftover newline
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("exit")) {
                System.out.println("\n🙏 Thank you for visiting The Coffee Counter!");
                break;
            }
        }

        sc.close();
    }

    public static int coffeePrice(int coffeeNum, Scanner sc) {

        int cpOfMocha = 50;
        int cpOfClassic = 100;
        int cpOfSpecial = 150;

        System.out.println("Please select the quantity:");
        System.out.println("1 => 200ml");
        System.out.println("2 => 300ml");

        int quantity = sc.nextInt();
        int price = 0;

        switch (quantity) {

            case 1:
                if (coffeeNum == 1) price = cpOfMocha;
                if (coffeeNum == 2) price = cpOfClassic;
                if (coffeeNum == 3) price = cpOfSpecial;
                break;

            case 2:
                if (coffeeNum == 1) price = cpOfMocha * 2;
                if (coffeeNum == 2) price = cpOfClassic * 2;
                if (coffeeNum == 3) price = cpOfSpecial * 2;
                break;

            default:
                price = 0;
        }

        return price;
    }

    public static void printBill(int coffeeNum,
                                 double basePrice,
                                 double gst,
                                 double total) {

        String coffeeName =
                (coffeeNum == 1) ? "Mocha" :
                (coffeeNum == 2) ? "Classic" : "Ravi Special";

        System.out.println("\n----------- ☕ BILL ☕ -----------");
        System.out.println("Coffee Type   : " + coffeeName);
        System.out.println("Base Price    : ₹" + basePrice);
        System.out.println("GST (18%)     : ₹" + gst);
        System.out.println("--------------------------------");
        System.out.println("Total Amount  : ₹" + total);
        System.out.println("--------------------------------");
    }
}
