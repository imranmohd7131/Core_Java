package array;
import java.util.Scanner;
public class num {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=ob.nextInt();
		System.out.println("Enter the elements:");
		int[] a=new int[n];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=ob.nextInt();
		}
		System.out.println("Entered Elements are:");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Reverse order");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	
}
