package Day1;
//Problem - 5

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		int n,rev=0,r,temp;
		//Where,rev starts with 0  Bcuz,we need the first r as it's
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a Number:");
		n=sc.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println("Given number is Palindrome");
		}else {
			System.out.println("Given number is Not Palindrome");
		}
		
	}

}
