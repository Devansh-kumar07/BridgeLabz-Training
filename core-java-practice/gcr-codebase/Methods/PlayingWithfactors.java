package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class PlayingWithfactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number::");
		int number = sc .nextInt();
		
		int []factors = findingAndStoringInArray( number);
		System.out.println("the factors of the given numbers are:"+ Arrays.toString(factors));
		
		System.out.println("sum of the factors are:"+ sumOfFactors(factors));
		
		System.out.println("product of the factors are:"+ productOfFactors(factors));
		
		System.out.println("the sum of square of the factors is:"+sumOfSquareOfFactors((factors)));

	}
	static int[] findingAndStoringInArray(int number) {
        
		int count = 0;
		int temp = number;
		for(int i=1;i<number;i++) {
			if(temp%i==0) 
			   count++;  
			}
		
		int[] arrayOfFactors = new int[count];
		int index=0;
		for(int j=1;j<number;j++) {
			if(temp%j==0) {
				arrayOfFactors[index]=j;
				index++;
				}
				   
			
		}
		return arrayOfFactors;
	 }
	static int sumOfFactors(int[] arrayOfFactors) {
		int sum=0;
		for(int factor:arrayOfFactors) {
			sum+=factor;
		}
		return sum;
		
	}
	static int productOfFactors(int[] arrayOfFactors) {
		int product =1;
		for(int factor:arrayOfFactors) {
			product*=factor;
		}
		return product;
		
	}
	static int sumOfSquareOfFactors(int[] arrayOfFactors) {
		int sum=0;
		for(int i=0;i<arrayOfFactors.length;i++) {
			sum+=Math.pow(arrayOfFactors[i], 2);
			// or for(factor:arrayOfFactors) sum+=Math.pow(factors,2);
		}
		return sum;
		
	}
	
	

}
