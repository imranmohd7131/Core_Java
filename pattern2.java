package pattern;

import java.util.Scanner;

public class pattern2 {
public static void main(String[] args) {
//	for(int i=1;i<=4;i++)
//	{
//		if(i==3 || i==1)
//		{
//		for(int j=1;j<=4;j++)
//		{
//			System.out.print("*");
//		}System.out.println();
//		}else
//		{
//			for(int n=1;n<=2;n++)
//			{
//				System.out.print("*");
//			}System.out.println();
//		}
//	}
	
//	for(int i=1;i<=4;i++)
//	{
//		if(i==4 || i==1)
//		{
//		for(int j=1;j<=4;j++)
//		{
//			System.out.print("*");
//		}System.out.println();
//		}else
//		{
//			for(int n=1;n<=2;n++)
//			{
//				System.out.print("*");
//			}System.out.println();
//		}
//	}
	
//	for(int i=1;i<=4;i++)
//	{
//		for(int j=1;j<=4;j++)
//		{
//			System.out.print(i);
//		}System.out.println();
//	}
	
//	for(int i=1;i<=3;i++)
//	{
//		for(int j=1;j<=4;j++)
//		{
//			System.out.print(i*i);
//		}System.out.println();
//	}
	
//	for(int i=1;i<=4;i++)
//	{
//		for(int j=1;j<=4;j++)
//		{
//			System.out.print(i*2);
//		}System.out.println();
//	}
	
	
//	for(int i=1;i<=4;i++)
//	{
//		for(int j=1;j<=i;j++)
//		{
//			System.out.print(i);
//		}System.out.println();
//	}
	
//	for(int i=4;i>=1;i--)
//	{
//		for(int j=1;j<=i;j++)
//		{
//			System.out.print(i);
//		}System.out.println();
//	}
	
//	for(int i=4;i>=1;i--)
//	{
//		for(int j=1;j<=i;j++)
//		{
//			System.out.print("*");
//		}System.out.println();
//	}
	
//	for(int i=1;i<=4;i++)
//	{
//		for(int j=1;j<=i;j++)
//		{
//			System.out.print("*");
//		}System.out.println();
//	}
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter rows:");
	int rows=sc.nextInt();
	System.out.println("Enter columns:");
	int cols=sc.nextInt();
	for(int i=1;i<=rows;i++)
	{
		for(int j=1;j<=cols;j++)
		{
			System.out.print(" * ");
		}System.out.println();
	}
}
}
