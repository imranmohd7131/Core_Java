package assignment;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vehicle obj = new Car(); 
		obj.Start();
		obj.Brake();
		obj.Accelerate();
		obj.AirBag();
		obj.MaxSpeed();
		System.out.println("----------------------------------"); 
		Vehicle obj2 = new Bus();
		obj2.Start();
		obj2.Brake();
		obj2.Accelerate();
		obj2.AirBag();
		obj2.MaxSpeed();
		 
	}
}
