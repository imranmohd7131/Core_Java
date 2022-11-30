package inheritance;
//method override
public class cardiologist extends doctor{
	
	cardiologist()
	{
		super();
	}
	@Override
	public void treat()
	{
		System.out.println("cardiologist is treating heart patients");
		super.treat();
		
	}
	public static void main(String[] args) {
		cardiologist obj=new cardiologist();
		obj.treat();
		
	}
}
