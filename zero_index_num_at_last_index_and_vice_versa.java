package array;
import java.util.Scanner;
class zero_index_num_at_last_index_and_vice_versa {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number:");
	int n=sc.nextInt();
	int n2=n;
	int digit;
	int count=0;
    while(n>0)
    {
    	digit=n%10;
    	count++;
    	n /=10;
    }
	int[] arr = new int[count];
	for(int i=0;i<=count-1;i++)
	{
		arr[i]=n2%10;
		n2/=10;
	}
	for(int i=0;i<=count-1;i++)
	{
		System.out.println(arr[i]);
	}
	
//	System.out.println();
//	System.out.println(arr[0]);
//	System.out.println(arr[1]);
//	System.out.println(arr[2]);
//	System.out.println(arr[3]);
//	System.out.println(arr[4]);
}
}
