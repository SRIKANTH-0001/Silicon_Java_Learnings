package Day2;
//Problem No.-10

import java.util.Scanner;

public class neonNumber {
	//Neon Number means,9=9*9=81=8+1=9 The result is being as input
	public static void main(String[] args) {
		int n,r,temp,sum=0;
		System.out.println("Enter the value:");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		n=n*n;
		while(n>0) {
			r=n%10;
			sum=sum+r;
			n=n/10;;
		}
		if(temp==sum) {
			System.out.println("The given number is a Neon Number");
		}else {
			System.out.println("The given number is Not a Neon Number");
		}
	}

}
