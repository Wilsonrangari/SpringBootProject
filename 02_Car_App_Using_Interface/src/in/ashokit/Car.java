package in.ashokit;

//target class
public class Car {
	//if you play with PetroLEngine constructor still it will not affect the car class that is the beauty of interface
	//now my car i stalking to interface not DieselEngine nor PetrolEngine directly
	//so loosly coupling
	//below is referenced variable where i can store object of impl. object of interface class i.e DiselEngine object or PetrolEngine object. Still Tightly coupling as i am creating object
	
	//private InterfaceEngine eng= new DieselEngine();
	//default value for refernce value is null
	private InterfaceEngine eng;
	
	//below you are passing interface object that means you need to pass impl.class object as parameter in Car Client object
	//Constructor injection
	
	/*
	 * public Car(InterfaceEngine eng) 
	 * { 
	 * 	this.eng=eng; 
	 * }
	 */
	//Setter Injection
	public void setEng(InterfaceEngine eng) {
		this.eng=eng;
	}
	public void drive() {

		int status = eng.start();

		if(status>=1) {
			System.out.println("Journey started");
		}
		else
			System.out.println("Jorney has not been started ");
	}



}

