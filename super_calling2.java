package constructor;

public class super_calling2 extends super_calling{
	/*super_calling2()
	{
		super();
		System.out.println("hl");
		
	}*/
	String name;
	super_calling2(String name,int age,String breed)
	{
		super(age,breed);
		this.name=name;
	}
	public static void main(String[] args) {
		super_calling2 obj=new super_calling2("spoozy",3,"german");
		//super_calling2 obj=new super_calling2();
		/*System.out.println(obj.age);
		System.out.println(obj.name);
		System.out.println(obj.breed);*/
		
	}
}
