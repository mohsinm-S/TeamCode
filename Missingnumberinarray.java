package Arrays;

import java.util.Arrays;

public class Missingnumberinarray {

	public static void main(String[] args) {
		int a[] = {1,2,3,5,6,7};
		
		int n=a.length+1;
		
		int expectedno =n * (n+1)/2;
		System.out.println(expectedno);
		
		int actual = Arrays.stream(a).sum();
		System.out.println(actual);
		
		int missing =expectedno-actual;
		System.out.println(missing);

	}

}
