package array;
import java.util.Scanner;
public class array {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=ob.nextInt();
		int[] arr=new int[n];
		int s=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=ob.nextInt();
			if(arr[i]>0)
			{
			s=arr[i];
			}
		}

	}
}
