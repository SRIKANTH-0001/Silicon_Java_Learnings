package Day6Abstraction;

public class Bus extends Vehicle{
	@Override
	void choose() {
		System.out.println("I'm a public vehicle called Bus");
	}

	@Override
	void register() {
		System.out.println("You have successfully Registered the ticket to your Bus!");
		
	}

	@Override
	void track() {
		System.out.println("By using your bus tracking id you can track the Bus!");
		
	}

	@Override
	void travel(){
		System.out.println("Now,You can get Into your Bus.");
	}

	@Override
	void stop() {
		System.out.println("Oh!oh! Here,it is ...your Bus stop!Please get out..");
		
	}
}
