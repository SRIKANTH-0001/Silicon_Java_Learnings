package Day6BankApp;

public class ATM implements Bank{

	int balance=1433;
	
	@Override
	public void deposit(int amount) {
		System.out.println("Kindly,Enter the Deposit Amount: "+amount);
		balance =balance+amount;
		System.out.println("After deposit Your account balance is:"+balance);
		
	}
	@Override
	public void withdraw(int amount) {
		System.out.println("Kindly,Enter the WithDraw Amount: "+amount);
		balance =balance-amount;
		System.out.println("After withdraw Your account balance is:"+balance);
	}
	
	@Override
	public void checkBalance() {
		System.out.println("Your current Balance is:"+balance);
		
	}
	
}
