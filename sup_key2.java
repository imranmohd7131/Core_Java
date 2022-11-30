package inheritance;

public class sup_key2 extends sup_key{
int age=20;
public void display()
{
System.out.println(age);
System.out.println(this.age);
System.out.println(super.age);

}
public static void main(String[] args) {
	sup_key2 obj=new sup_key2();
	obj.display();
	
}
}
