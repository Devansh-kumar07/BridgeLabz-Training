import java.util.Scanner;

public class DivByFive{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = scan.nextInt();

		boolean IsDiv = (number % 5 == 0);
		System.out.println("Is the number " + number + "divisible by 5?" + IsDiv);
	}
}
