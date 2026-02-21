package Arrays;

import java.util.Arrays;

public class Arraycopyandreverse {

	public static void main(String[] args) {
		int [] a= {1,2,3,4};
		int [] b= new int[a.length];
		int [] c= {1,2,3,5,6,6};
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
			
		}
System.out.println(Arrays.toString(a));
System.out.println(Arrays.toString(b));

  boolean b1= Arrays.equals(a, c);
  
  if(b1) {
	  System.out.println("Both are equal");
  }else {
	  System.out.println("Both are not equal");
  }
	}

}
