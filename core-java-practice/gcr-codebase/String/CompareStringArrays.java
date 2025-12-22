package String;

import java.util.Arrays;
import java.util.Scanner;

public class CompareStringArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the text-->");
		String text = sc.nextLine();
		 char[] array1 = normalmethod(text);
	     char[] array2 = methodUsingCharArrays(text);
	     	     
	     boolean result = comparingBothMethod(array1,array2);
	     System.out.println("Are both arrays equal? " + result);
	     		
	}
	
	static char[] normalmethod(String text) {
		
		char[] c1 = new char[text.length()];
		
		for(int i=0;i<text.length();i++) {
			c1[i]=text.charAt(i);
			
		}
		System.out.println("your output using charArray methos is:"+ Arrays.toString(c1));
		return c1;
		
	}
	static char[] methodUsingCharArrays(String text) {
		char[] c2 =text.toCharArray();
		System.out.println("your output using charArray methos is:"+ Arrays.toString(c2));
		return c2;
		
	}
	static boolean comparingBothMethod(char[] c1,char[] c2) {
		return Arrays.equals(c1, c2);
	}

}
