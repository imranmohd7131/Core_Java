package string;

import java.util.Scanner;

public class print {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter any String");
		String  str=ob.nextLine();
		String s="",s2="";
		System.out.println("-----------------------------------");
		System.out.println("Entered String Print :");
		for(int i=0;i<=str.length()-1;i++)
		{
			s=s+str.charAt(i);
			
		}System.out.println(s);
		System.out.println("-----------------------------------");
		System.out.println("Entered String Print in Reverse Order:");
		for(int i=str.length()-1;i>=0;i--)
		{
			s2=s2+str.charAt(i);
		}
		System.out.println(s2);
	}
}
