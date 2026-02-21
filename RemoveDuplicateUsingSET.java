package Arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateUsingSET {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,3,4,6,7,8,5,4,10};
		
		Set<Integer> set=new HashSet<>();
		for(Integer num:a) {
			set.add(num);
		}
		System.out.println(set);
	}

}
