package global;

class globallocal {
	String color;
	double price;
	public globallocal(String color,double price)
	{
		this.color=color;
		this.price=price;
	}
/*int age;
 public globallocal(int age)
 {
	 this.age=age;
	 
 }*/
public static void main(String[] ar)
{
	globallocal b2=new globallocal("red",150);
	System.out.println(b2.color);
	System.out.println(b2.price);
	/*globallocal b=new globallocal(20);
	System.out.println(b.age);*/
}
}
