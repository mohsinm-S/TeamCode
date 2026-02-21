package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class SortingArray {

	public static void main(String[] args) {
	
		Integer a[]= {2,6,3,5,8,9,7};
		
Arrays.sort(a,Collections.reverseOrder());
		

	System.out.println(Arrays.toString(a));	
	System.out.println(a[2]);
	
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));



	}

}
