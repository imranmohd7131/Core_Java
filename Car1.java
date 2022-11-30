
public class Car1 implements Vehicle{
    @Override
	public void run()
 {
	 System.out.println("run");
 }
    public static void main(String[] args) {
		Vehicle obj = new Car1();
		obj.run();
		System.out.println(Vehicle.price);
	}
}
