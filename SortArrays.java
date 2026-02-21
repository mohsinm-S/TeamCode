package Arrays;

import java.util.Arrays;
import java.util.Collections;


public class SortArrays {

	public static void main(String[] args) {
		int [] a= {8,4,9,10,1};
	
	//Arrays.sort(a);
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));

	for(int i=a.length-1;i>=0;i--) {
		
		
		
		System.out.print(a[i]);
		if(i>0) System.out.print(" , ");
		
	
	}

	}

}
