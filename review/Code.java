package review;

import java.util.Arrays;

public class Code {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 5, 6, 7, 8, 9};

        int n = arr.length;
        int mid = n / 2;

        int zeroCount = 0;

       for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
        }

        int leftZeros = zeroCount / 2;
        int rightZeros = zeroCount / 2;
        boolean middleZero = (zeroCount % 2 != 0);

      //  non-zero elements to cente
        int write = leftZeros;

        for (int read = 0; read < n; read++) {
            if (arr[read] != 0) {
                arr[write] = arr[read];
                write++;
            }
        }

      //  Place middle zero if odd
        if (middleZero) {
            arr[write] = 0;
            write++;
        }

        // 4️⃣ Fill left side with zeros
        for (int i = 0; i < leftZeros; i++) {
            arr[i] = 0;
        }

     // right side with zeros
        for (int i = n - rightZeros; i < n; i++) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
