package pattern;

public class Pattern {
public static void main(String[] args) {
	/*for(int i=1;i<=10;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}System.out.println();
	}*/
	
	for(int i=1;i<=10;i++)
	{
		for(int j=10;j>=i;j--)
		{
			System.out.print("*");
		}System.out.println();
	}
	
	for(int i=1;i<=10;i++)
	{
		for(int j=10;j>=1;j--)
		{
			if(j>i)
			{
				System.out.print(" ");
			}else
			{
				System.out.print("*");
			}
		}System.out.println("");
	}
	
	for(int i=1;i<=10;i++)
	{
		for(int j=1;j<=10;j++)
		{
			if(j>i)
			{
				System.out.print("*");
			}else
			{
				System.out.print(" ");
			}
		}System.out.println("");
	}
	
	for(int i=1;i<=10;i++)
	{
		for(int j=10;j>=1;j--)
		{
			if(j>i)
			{
				System.out.print(" ");
			}else
			{
				System.out.print(" @");
			}
		}System.out.println("");
	}
}
}
