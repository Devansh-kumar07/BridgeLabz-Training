package String;

import java.util.Scanner;

public class compareTwoStrings {
	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("write both words:");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		if(s1.equals(s2)) {
			System.out.println("Both Strings are equal");
		}
		else{System.out.println("Both Strings are not equal");
		}
		
		continue;}
	}

}
