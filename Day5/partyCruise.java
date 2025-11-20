package Day5;
//Problem No - 5
import java.util.Scanner;

public class partyCruise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the timing:");
		int t=sc.nextInt();
		int i;
		int e[]=new int[t];
		int l[]=new int[t];
		
		System.out.println("Now,you can say How Many people has entered!");
		for(i=0;i<t;i++) {
			e[i]=sc.nextInt();
		}
		
		System.out.println("Now,you can say How Many people has left!");
		for (i=0;i<t;i++) {
			l[i]=sc.nextInt();
		}
		
		int max=0,sum=0;
		for(i=0;i<t;i++) {
			sum+=e[i]-l[i];
			max=Math.max(max, sum);
		}
		
		System.out.println("Max. attendees are : "+max);
	}

}
