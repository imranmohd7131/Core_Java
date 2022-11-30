package global;

class demo {
	public void printdetails(String name,int roll,String collegeName)
	{
	    System.out.println(name+"\n"+roll+"\n"+collegeName);	
	}
	public void printdetails(int roll,String name,String collegeName)
	{
		System.out.println(name+"\n"+roll+"\n"+collegeName);	
	}
	public void printdetails(String name,String collegeName,int roll)
	{
		System.out.println(name+"\n"+roll+"\n"+collegeName);
	}
public static void main(String[] args) {
	demo ob=new demo();
	ob.printdetails("imran", 54, "pggc11");
	ob.printdetails(54,"imran", "pggc11");
	ob.printdetails("imran","pggc11" ,54 );
}
}
