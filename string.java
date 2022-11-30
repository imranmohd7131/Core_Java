package string;
//wap to print string from middle part to end first and after that first part to middle 
import java.util.Scanner;

class string {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any string");
	String str=sc.nextLine();
	for(int i=str.length()/2;i<=str.length()-1;i++)
	{
	 System.out.print(str.charAt(i));
	}
	for(int i=0;i<=str.length()/2-1;i++)
	{
		System.out.print(str.charAt(i));
	}
	
//wap to print string from middle part to first in reverse order and after that middle to end 
	/*for(int i=str.length()/2-1;i>=0;i--)
	{
		System.out.print(str.charAt(i));
	}
	for(int i=str.length()/2;i<=str.length()-1;i++)
	{
		System.out.print(str.charAt(i));
	}*/
}
}
