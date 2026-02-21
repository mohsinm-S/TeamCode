package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class MaxNumberArray {

	public static void main(String[] args) {
		int [] a= {20,30,500,100,10000};
		
	 int  max =a[0];
	
		for(int i=1;i<a.length;i++) {
			
			if(a[i]>max) {
				
				max=a[i];
			}
		}
System.out.println(max);
		
	Integer[] a1={20,30,500,100};
	int length = a1.length;
	Arrays.sort(a1,Collections.reverseOrder());
	//Arrays.sort(a1);
	System.out.println(a1[length-1]);
	
	}
}
