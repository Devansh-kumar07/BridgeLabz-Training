public class Q24_NumberChecker_Enhanced {
    public static void main(String[] args) {
        int number = 153; 
        System.out.println("Number: " + number);

        int digitCount = NumberChecker.countDigits(number);
        System.out.println("Digit Count: " + digitCount);

        int[] digits = NumberChecker.getDigits(number);
        System.out.print("Digits Array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        boolean isDuck = NumberChecker.isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuck);

        boolean isArmstrong = NumberChecker.isArmstrong(number, digits);
        System.out.println("Is Armstrong Number: " + isArmstrong);

        NumberChecker.findLargestAndSecondLargest(digits);
        NumberChecker.findSmallestAndSecondSmallest(digits);
    }
}

class NumberChecker {
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] getDigits(int number) {
        String str = String.valueOf(number);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }
    public static boolean isDuckNumber(int[] digits) {
            for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }
    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + (secondLargest == Integer.MIN_VALUE ? "None" : secondLargest));
    }
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        System.out.println("Smallest Digit: " + smallest);
        System.out.println("Second Smallest Digit: " + (secondSmallest == Integer.MAX_VALUE ? "None" : secondSmallest));
    }
}
