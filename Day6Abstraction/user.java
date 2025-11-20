package Day6Abstraction;

public class user {
	//If I wanna use the methods or others in abstraction class.
	//Then,I should have to make the current class as abstraction class
	public static void main(String args[]) {
		System.out.println("Which vehicle do you want to travel?\n1.Bus\n2.Bike");
		Bus b=new Bus();
		Bike b1=new Bike();
		/*b.choose();
		b.register();
		b.track();
		b.travel();
		b.stop();*/
		
		b1.choose();
		b1.register();
		b1.track();
		b1.travel();
		b1.stop();
	}
}
