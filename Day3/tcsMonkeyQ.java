package Day3;
//Problem No -1
import java.util.Iterator;
//Tcs Problem-1
import java.util.Scanner;

public class tcsMonkeyQ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Total Monkeys:");
		int n=sc.nextInt();
		System.out.println("Bananas eaten by one Monkey:");
		int k=sc.nextInt();
		System.out.println("Peanuts eaten by one Monkey:");
		int j=sc.nextInt();
		System.out.println("Total no. of Available Bananas :");
		int m=sc.nextInt();
		System.out.println("Total no. of Available Peanuts :");
		int p=sc.nextInt();

		if(n<0 || k<=0 ||j<=0 || m<0 || p<0) {
			System.out.println("Invalid Input!");
		}
		
		int bAteByM=m/k;
		int pAteByM=p/j;
		
		int totalMEatenBP=bAteByM+pAteByM;
		
		
		if(totalMEatenBP>n) {
			totalMEatenBP=n;
		}
		
		int result=n-totalMEatenBP;
		
		System.out.println("The remaining monkey on the tree is:"+result);
	}

}
