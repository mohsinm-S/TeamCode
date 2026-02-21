package Arrays;

import java.util.Arrays;

public class BubblesortArray {

	public static void main(String[] args) {
		int [] a= {5,4,6,2,3};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
String aa=Arrays.toString(a);
System.out.println(aa);
		
Arrays.sort(a);

 int rd=a[a.length-1];
 System.out.println(rd); // 3rd possitions
		
	}

	
	
}
