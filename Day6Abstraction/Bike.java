package Day6Abstraction;

public  class Bike extends Vehicle {
	@Override
	void register() {
		System.out.println("You have successfully Registered your Bike!");
		
	}

	@Override
	void track() {
	
		System.out.println("By using your Bike tracking id you can track the Bike!");
		
	}

	
	void obtain() {
		System.out.println("Now,You can obtain your Bike.");
	}

	@Override
	void travel() {
		System.out.println("Oh!oh! Here,it is ...you can drive the Bike");
		
	}
	
	@Override
	void choose() {
		System.out.println("I'm a private vehicle called Bike");
	}
	
	@Override
	void stop() {
		System.out.println("Fuel is Insufficient!Stop the vehicle or find the fuel Bunk.");
}
}
