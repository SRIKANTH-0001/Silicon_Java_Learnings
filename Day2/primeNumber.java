package Day2;
//Problem - 6

import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		int n,count=0;
		System.out.println("Enter the value:");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
				//Whenever the reminder is 0 then,count will increment
			}
		}
		if(count==2) {
			//Bcuz,Prime number is divisible by itself or by 1 that's why count===2
			System.out.println("Given number is Prime Number");
		}else {
			System.out.println("Given number is Not a Prime Number");
		}
	}

}
