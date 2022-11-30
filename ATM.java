public class ATM extends Bank{
	int balance=5000;
	@Override
	public void deposit(int amount)
	{ 
		balance +=amount;
		System.out.println(amount+" rs Desosited");
		CheckBalance();
	}
	@Override
	public void withdraw(int amount)
	{
		if(balance>=amount)
		{
		balance -=amount;
		System.out.println(amount+" rs Withdraw");
		CheckBalance();
		}else
		{
			System.out.println("Insufficient Balance aukat me reh kar paise nikalo");
		}
	}
	@Override
	public void CheckBalance()
	{
		System.out.println("Available Balance :"+balance+" rs");
	}

}
