package object;

public class car {
	int price;
	int maxSpeed;
	String color;
	
	car(int price,int maxSpeed,String color)
	{
		this.price=price;
		this.maxSpeed=maxSpeed;
		this.color=color;
	}
	@Override
	public String toString()
	{
		return price+maxSpeed+color;
	}
	public int hashCode()
	{
		
		return price+maxSpeed+color.hashCode();
	}
	public boolean equals(Object ob)
	{
		
		return this.hashCode()==ob.hashCode();
	}
public static void main(String[] args) {
	car obj = new car(500,100,"A");
	System.out.println(obj);
	car obj2 = new car(500,100,"A");
	System.out.println(obj2);
	System.out.println(obj.hashCode());
	System.out.println(obj2.hashCode());
	String a="s";
	String b="s";
	System.out.println(a==b);
	System.out.println(obj==obj2);
	System.out.println(obj.equals(obj2));
}
}
