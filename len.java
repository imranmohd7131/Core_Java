package string;
import java.util.Scanner;
public class len {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=ob.next();
		String t="";
		System.out.println("Print sinlge character of string:");
		for(int i=0;i<=str.length()-1;i++)
		{
			System.out.println(str.charAt(i));
		}
		System.out.println("Print sinlge character of string in reverse order:");
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
		System.out.println("Print String in Reverse Order:");
		for(int i=str.length()-1;i>=0;i--)
		{
			t=t+str.charAt(i);
			
		}System.out.println(t);
	}

}
