
public class use_of_final2 extends use_of_final{
	static void run()
	 {
		 System.out.println("running");
	 }
public static void main(String[] args) {
	use_of_final2 ob= new use_of_final2();
	System.out.println(ob.a);
	int s=ob.a;
	//s=4;
	System.out.println(s);
	ob.run();
}
}
