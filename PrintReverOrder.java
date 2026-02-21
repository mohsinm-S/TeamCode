package Arrays;

import java.util.Arrays;

public class PrintReverOrder {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		int b[]= new int [4];
		
		for(int i=0,j=a.length-1;i<a.length;i++,j--) {
				
				
				b[j]=a[i];
			  }
			
	
		
	System.out.println(Arrays.toString(a));	
	System.out.println(Arrays.toString(b));	
		

	}

}
