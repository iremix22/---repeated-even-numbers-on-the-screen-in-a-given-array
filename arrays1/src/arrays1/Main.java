package arrays1;

import java.util.Arrays;

//a program that prints repeated even numbers on the screen in a given array

public class Main {
static boolean isFind(int []arr,int value) {
	for(int i: arr) {
		if(i==value) {
			return true;
		}
	}
	return false;
}
	

public static void main(String[] args) {
		

		
		
		int [] array= {12,2,4,233,2,3,22,5,9,8,34,24,4432,24,6,12};
		
		int [] again=new int[array.length];
		
		int startIndex=0;
		
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				
				if(i!=j && array[i]==array[j]) {
					if(array[i] % 2==0) {
					
					if(!isFind(again,array[i])) {
						again[startIndex++] = array[i];	
					}
			               break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(again));	
		
	}

}
