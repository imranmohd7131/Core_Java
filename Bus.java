package assignment;

public class Bus extends Vehicle{

	@Override
	public void Start() {
		System.out.println("Starting a Bus");
		
	}

	@Override
	public void Brake() {
		System.out.println("Use brake to slowing or stopping a Bus");
		
	}

	@Override
	public void Accelerate() {
		System.out.println("To change speed of Bus");
		
	}

	@Override
	public void AirBag() {
		System.out.println("Airbags will make Bus safer");
		
	}

	@Override
	public void MaxSpeed() {
		System.out.println("MaxSpeed of a Bus is 120");
		
	}

}
