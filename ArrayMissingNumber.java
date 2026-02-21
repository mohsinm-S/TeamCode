package Arrays;

public class ArrayMissingNumber {

	public static void main(String[] args) {
		int [] a= {10,20,30,50};
		
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<a.length;i++) {
			
			sum1=sum1+a[i];
		}
		
		for(int j=10;j<=50;j+=10) {
			 sum2=sum2+j;
			
		}
		System.out.print("Missing number: ");
         System.out.print( sum2-sum1);
	}

}
