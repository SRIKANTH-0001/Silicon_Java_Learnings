package Day1;
//Problem - 4

import java.util.Scanner;

public class oddOrEven {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a Number:");
		n=sc.nextInt();
		if(n%2==0) {
			System.out.println("The given number is Even");
		}else {
			System.out.println("The given number is Odd");
		}

	}

}
