package in.ashokit;

public class PetrolEngine implements InterfaceEngine {
	
	//if you play with constructor still it will not affect the car class that is the beauty of interface
//	public PetrolEngine(int i) {
//		
//	}

	
	public int start() {
		System.out.println("Petrol Engine stared");
		return 1;
	}

}
