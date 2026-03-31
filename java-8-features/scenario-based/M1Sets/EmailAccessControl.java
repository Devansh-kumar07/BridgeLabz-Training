package M1Sets;

import java.util.Scanner;

public class EmailAccessControl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String regex ="^[a-z]{3,}\\.[a-z]{3,}\\d{4,}@(sales||marketing|IT|product)\\.company\\.com$";
		
		while(sc.hasNext() && n-- >0) {
		String input = sc.nextLine();
		if(input.matches(regex)) {
			System.out.println("Access Granted");
		}
		else {
			System.out.println("Access Denied");
		}
		
	}	
		
}

}
