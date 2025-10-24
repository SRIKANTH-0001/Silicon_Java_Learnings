package Day1;
//Problem - 1
import java.util.Scanner;

public class countDigits {
	public static void main(String args[]) {
		int n,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a Number:");
		n=sc.nextInt();
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println("The count of digits in a given Number:"+count);
	}
}
