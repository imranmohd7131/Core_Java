package test;

public class quotes {
	static boolean b=false;
    static boolean a=true;
	static boolean Try()
	{
		return b;	
	}
	static boolean NoSuccess()
	{
		return a;	
	}
	static boolean TryAgain()
	{
		System.out.println("improve");
		return b;	
	}
	static boolean Improve()
	{
		System.out.println("improve");
		return a;	
	}
 public static void main(String[] args) {
	boolean succeed;
	boolean success=false; 
	boolean found=true;
	int Try=0;
	boolean fail=true;
	
	while(success !=found)
	{
		Try++;
		if(fail)
		{
			TryAgain();
		}
	}
	
	
	//while( !(succeed = Try()) );
	/*if(NoSuccess())
	{
		TryAgain();
	}
	else 
		{
		Improve();
		};*/
 }
}
