package Day1;
//Problem - 2

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		int n,sum=0,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a Number:");
		n=sc.nextInt();
		while(n>0) {
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("The sum of the digits in given Number is:"+sum);
	}

}
