package Day1;
//Problem - 3

import java.util.Scanner;

public class reverseDigits {

	public static void main(String[] args) {
		int n,rev=0,r;
		//Where,rev starts with 0  Bcuz,we need the first r as it's
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a Number:");
		n=sc.nextInt();
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println("The reverse of the given Number is:"+rev);
	}

}
