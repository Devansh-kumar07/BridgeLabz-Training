package leetcode;

public class ReverseInt {

    public static int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;
 // overflow check
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10)
                return 0;

            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
}
