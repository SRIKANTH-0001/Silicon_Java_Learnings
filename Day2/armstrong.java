package Day2;
//Problem - 8
import java.util.Scanner;

public class armstrong {
	//ArmStrong number means,153=1^3+5^3+3^3=153
	public static void main(String[] args) {
		int n,r,arm=0,temp;
		System.out.println("Enter the value:");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			arm=(r*r*r)+arm;
			n=n/10;
		}
		if(temp==arm) {
			System.out.println("Given number is an Armstrong Number");
		}else {
			System.out.println("Given number is not a Armstrong Number");
		}
	}

}
