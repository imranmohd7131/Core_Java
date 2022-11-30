package pattern;

class test {
	String collegeName="PGGC11";
	static String location="Sector 11,Chd";
	
	public void r(){
		System.out.println(location);	
	System.out.println("Ready for exams");
	} 
public static void main(String[] args) {
	/*for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println("");
	}*/
	
	/* System.out.println(new college());  object*/
	test ob=new test();
	System.out.println(ob.collegeName);
	ob.r();
	//ob.conductExams();
	//System.out.println(collegeName);
		
}
}
