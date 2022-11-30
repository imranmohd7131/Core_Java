package array;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int num2=num;
		int count=0;
		while(num>0)
		{
			num/=10;
			count++;
		}
		int[] arr=new int[count];
		for(int i=0;i<=count-1;i++)
		{
			arr[i]=num2%10;
			num2/=10;
			System.out.println(arr[i]);
		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}
}
