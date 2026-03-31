package Methods;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number::");
		int number = sc .nextInt();
		
		if(number<1) {
			System.out.println("invalid number pls give a natural number:💀");
			System.out.println("Re-Run the prog to give input again--------");
			
	  }
		 int recSum = nNaturalNumberSumRecursion( number);
		 System.out.println(" sum of n natural numbers using recursion is-->"+ recSum);
		 int foSum = nNaturalNumberSumFormulae( number) ;
		 System.out.println(" sum of n natural numbers using formulae is-->"+ foSum);
		 
		 System.out.println(" now comparing both the results----"+
		                     "\n"+ "and the result is......"+comparingBothMethod( recSum, foSum));
		
		
	}
	static int nNaturalNumberSumRecursion(int number) {
		if(number==1) {
			return 1;
		}
		return number+nNaturalNumberSumRecursion(number-1);
		
	}
	static int nNaturalNumberSumFormulae(int number) {
		
		int sum=number*(number+1)/2;
		return sum;
		
	}
	static boolean comparingBothMethod(int recSum,int foSum) {
		if(recSum != foSum) {
		return false;
		
	}
		return true;
}
}
