import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
			Bank obj = new ATM();
			boolean b=true;
	 
	 for(int i=0;i<args.length;i++)
	 {
	  //while(b)
         //{
	 System.out.println("1. deposit");
	 System.out.println("2. withdraw");
	 System.out.println("3. CheckBalance");
	 int input=sc.nextInt();
			if(input == 1)
			{
				System.out.println("Enter the amount to deposit");
				int amount =sc.nextInt();
				obj.deposit(amount);
			}
			else if(input == 2)
			{
				System.out.println("Enter the amount to withdraw");
				int amount=sc.nextInt();
				obj.withdraw(amount);
			}
			else if(input == 3)
			{
				obj.CheckBalance();
			}
			else if(input == 0)
			{
				b=false;
			}
			else
			{
				System.out.println("Invalid input");
			}
            }

	 }
	}