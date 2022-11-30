package scanner_class;
import java.util.*;
 class take {
	 public static void main(String[] args) {
		 Scanner ob=new Scanner(System.in);
		 System.out.println("enter length of array:");
		 int n=ob.nextInt();
		 System.out.println("enter numbers:");
		 int[] arr=new int[n];
		 for(int i=0;i<=n-1;i++)
		 {
			 arr[i]=ob.nextInt();
		 }
		 System.out.println("print entered numbers:");
		 for(int i=0;i<=n-1;i++)
		 {
			 System.out.println(arr[i]);
		 }
		 System.out.println("print entered numbers in reverse order:");
		 for(int i=n-1;i>=0;i--)
		 {
			 System.out.println(arr[i]);
		 }
	}
 }
