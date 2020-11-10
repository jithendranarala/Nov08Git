package softwareTestingMaterial;

import java.util.Arrays;

public class SmallestAndLargestInArray {

	public static void main(String[] args) {	
		int number[] = {-12,3,-45,1,-1,67}; 
		int smallest = number[0];
		int largest = number[0];
		
		for (int i=1; i<number.length;i++) {
			if (number[i] > largest) {
				largest = number[i];
			} else if ( number[i] < smallest) {
				smallest = number[i];
			}
		}
		
		System.out.println(Arrays.toString(number));
		System.out.println("Largest " + largest);
		System.out.println("Smallest" + smallest);
		
		//This is for testing		
		
	}

}
