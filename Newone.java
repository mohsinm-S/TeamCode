package Arrays;

import java.util.Arrays;

public class Newone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] ={1,3,4};
		  int b[]= a.clone();
		  
		  int c[]= new int[a.length+b.length];
		  
		  for(int i=0;i<a.length;i++) {
			  c[i]=a[i];
			  c[a.length+i]=b[i];
			  
		  }
		  
		  
		  System.out.println(Arrays.toString(c));
	}

}
