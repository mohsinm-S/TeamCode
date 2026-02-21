package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) 
		 {
			  int a[] ={1,2,5,3,5,3,5,5,5,5,5};
			  
			int uniq[] = Arrays.stream(a).distinct().toArray();


	System.out.println(	Arrays.toString(uniq));



	}

}
