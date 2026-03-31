package javapractice;

import java.util.Scanner;

class Solution {
    public static boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        char[] ch = binary.toCharArray();
        for(int i=1 ; i< ch.length;i++){
            if(ch[i]==ch[i-1] )
            return false;

        }
        return true;
    }
}

public class BinaryNumberWithAlternatingBits {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	System.out.println(Solution.hasAlternatingBits(n));
}
}
