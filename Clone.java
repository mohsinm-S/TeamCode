package Arrays;

import java.util.Arrays;

public class Clone {

	public static void main(String[] args) 
	{

		  int a[] ={1,3,4};
		  int b[] =new int[a.length];
		
		  
		  for(int i=0;i<a.length;i++)
		  {
		   b[i]=a[i];
		   }
		 System.out.println(Arrays.toString(b));
		 System.out.println(Arrays.toString(a));
		 
		boolean b1= Arrays.equals(a, b);
		if(b1) {
			System.out.println("Both arrays are equal");
		}
		else {
			System.out.println("Both arrays are not equal");
			
		
		}

	}

}
