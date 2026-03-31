//package M1Sets;
//
//import java.util.Scanner;
//
//public class KeyGenration {
//	
//	public static void ValidateKey(String key) {
//		
//		if(key.length() < 6) {
//			System.out.println("Invalid Input (length < 6)");
//			return;
//		}
//
//		if(key.matches(".*[!@#$%^&].*")) {
//			System.out.println("Invalid input (contain special character)");
//			return;
//		}
//		if(key.matches(".*\\d+.*")) {
//			System.out.println("Invalid Input (contains digits)");
//			return;
//		}
//		if(key.isEmpty()) {
//			System.out.println("Invalid input(empty String)");
//			return;
//		}
//		
//		
//	
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n =Integer.parseInt(sc.nextLine());
//		
//		while(sc.hasNext() && n-- >0) {
//			String key = sc.nextLine();
//			
//			ValidateKey(key);
//		key = key.toLowerCase();
//		//char [] evenAscii = {'e','i','o','u'};
//		key = key.replaceAll("[eiou]", "");
//		
//		StringBuilder sb = new StringBuilder(key).reverse();
//		String newStr = sb.toString();
//		char[] ch =newStr.toCharArray();
//		for(int i=0 ;i<ch.length;i++) {
//			if(i%2==0) {
//				ch[i]  = Character.toUpperCase(ch[i]);
//
//			}
//		}
//		
//		String final ="";
//		
//		for(char c : ch) {
//			final +=c;
//		}
//		System.out.println(final);
//			
//		}
//	}
//
//}
package M1Sets;

import java.util.Scanner;

public class KeyGenration {

    public static boolean validateKey(String key) {

        if (key.isEmpty()) {
            System.out.println("Invalid Input (empty string)");
            return false;
        }

        if (key.length() < 6) {
            System.out.println("Invalid Input (length < 6)");
            return false;
        }

        if (key.contains(" ")) {
            System.out.println("Invalid Input (contains space)");
            return false;
        }

        if (key.matches(".*\\d.*")) {
            System.out.println("Invalid Input (contains digits)");
            return false;
        }

        if (!key.matches("[a-zA-Z]+")) {
            System.out.println("Invalid Input (contains special character)");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {

            String key = sc.nextLine();

            if (!validateKey(key)) {
                continue;
            }

            // Step 1: lowercase
            key = key.toLowerCase();

            // Step 2: remove characters with even ASCII values
            String temp = "";
            for (char c : key.toCharArray()) {
                if (c % 2 != 0) {
                    temp += c;
                }
            }

            // Step 3: reverse
            String reversed = new StringBuilder(temp).reverse().toString();

            // Step 4: uppercase characters at even index
            char[] ch = reversed.toCharArray();

            for (int i = 0; i < ch.length; i++) {
                if (i % 2 == 0) {
                    ch[i] = Character.toUpperCase(ch[i]);
                }
            }

            String result = new String(ch);

            System.out.println("The generated key is - " + result);
        }

    }
}

