package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Heightest5 {

	//Find the 5th highest number in an array or list
	public static void main(String[] args) {
		
		Integer[] a= {12, 45, 7, 23, 56, 89, 34, 5, 1, 67};
		
		 Arrays.sort(a,Collections.reverseOrder());
		
		 
		System.out.println(Arrays.toString(a));
		
		
		
		 
		
		
	}

}
