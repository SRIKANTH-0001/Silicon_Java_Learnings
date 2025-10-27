package Day2;
//Problem No.-9 

import java.util.Scanner;

public class autoMorphic {
	//AutoMorphic number means,5=5*5=25 Where,the answer end with 5 So that's why
	public static void main(String[] args) {
		int n,r,temp,mul;
		System.out.println("Enter the value:");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		mul=n*n;
		r=mul%10;
		if(temp==r) {
			System.out.println("The Entered number is Automorphic Number!");
		}else {
			System.out.println("Given Number is not a Automorphic ");
		}

	}

}
