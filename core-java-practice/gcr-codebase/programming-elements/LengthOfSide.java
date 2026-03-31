package scenario_based;
import java.util.Scanner;

public class LengthOfSide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the parimeter of square");
		int parimeter = sc.nextInt();
		
		double side = parimeter/4;
		System.out.println("the side of the square is"+side);
		
	}

}
