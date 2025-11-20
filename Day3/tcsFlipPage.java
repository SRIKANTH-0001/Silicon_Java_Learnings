package Day3;
//TCS Problem No -5
import java.util.Scanner;
public class tcsFlipPage {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        System.out.println("Give the value of n:");
        int n=sc.nextInt();
        System.out.println("Give the value of p:");
        int p=sc.nextInt();
        
        int flipFromFront=p/2;
        // p/2 Bcuz,a single paper has the 2 pages
        int flipFromBack=(n/2)-(p/2);
        
        int result=Math.min(flipFromFront,flipFromBack);
        
        System.out.println("The result is:"+result);

	}

}
