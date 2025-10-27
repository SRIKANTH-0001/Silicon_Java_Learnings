package Day2;
//Problem - 7
import java.util.Scanner;
	//Factorial Means 5=5*4*3*2*1=120
public class factorial {
	public static void main(String[] args) {
		int n,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a Number:");
		n=sc.nextInt();
		for(int i=n;i>0;i--) {
			fact=fact*i;
		}
		System.out.println("Factorial of a Given Number:"+fact);
	}
}
