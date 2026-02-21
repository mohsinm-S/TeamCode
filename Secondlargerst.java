package Arrays;

import java.util.Arrays;

public class Secondlargerst {

	public static void main(String[] args) {
		
		int a[] = {10,25,80,500,5,52,800};
		
		Arrays.sort(a);
		
		int first=a[a.length-1];
	     int scond=	a[a.length-2];
	
		System.out.println(first);
		System.out.println(scond);
		
	}

}
