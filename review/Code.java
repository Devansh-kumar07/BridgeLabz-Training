package review;

import java.util.Arrays;

public class Code {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,0,5,6,7,8,9};
		
		
		int arrMid = arr.length/2;
		int count =0;
		int left =arr[0];
		int right=arr[arr.length-1];
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==0) {
				count++;}
			if(count%2!=0) {
					//arr[left+1]=arr[left];
					arr[left+1]=arr[left];
					arr[i]=arr[left];}
					
					
			if(count%2==0) {
				arr[right-1]=arr[right];
				arr[right]=arr[i];
			}
						
				
				else {
					arr[arrMid]=arr[i];
//					arr[i]=arr[i];
					
				}
				
			}
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
