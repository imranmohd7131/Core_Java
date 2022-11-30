package creating_Bank_Atm;
import java.util.Scanner;
class User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank obj = new ATM();
		boolean b=true;
		while(b)
		{
		System.out.println("1. deposit");
		System.out.println("2. withdraw");
		System.out.println("3. CheckBalance");
		System.out.println("0. Exit");
		//System.out.println("");
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
