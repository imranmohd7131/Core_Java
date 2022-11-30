package assignment;

public class Car extends Vehicle{

	  @Override 
	  public void Start() { System.out.println("Starting a Car");
	  
	  }
	  
	  @Override
	  public void Brake() {
	  System.out.println("Use brake to slowing or stopping a Car");
	  
	  }
	  
	  @Override
	  public void Accelerate() {
	  System.out.println("To change speed of Car");
	  
	  }
	  
	  @Override
	  public void AirBag() {
	  System.out.println("Airbags will make Cars safer");
	  
	  }
	  
	  @Override
	  public void MaxSpeed() {
	  System.out.println("MaxSpeed of a Car is 220"); }
	 	
}
