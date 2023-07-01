package in.ashokit;

public class CarClient {

	public static void main(String[] args) {
		
		Car c = new Car();
		//Car c =new Car(new PetrolEngine()); //constructor injection in Car class
		
		//we are passing object to setEng() method
		c.setEng(new DieselEngine()); // Setter Injection i.e dependednt object is being injected to target object using target class variable/setter method /constructor
		c.drive();
		System.out.println(c.hashCode());
	}

}
    