package Day3;
//TCS Problem - 3
import java.util.Scanner;

public class tcsCandyJarQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many candies are required?");
        int req=sc.nextInt();
        int result=10;
        if(req<=5) {
        		result=result-req;
        	 System.out.println("NUMBER OF CANDIES SOLD : "+req);
             System.out.println("NUMBER OF CANDIES LEFT : "+result);
        }else if(req>5) {
        	 System.out.println("INVALID INPUT");
             System.out.println("NUMBER OF CANDIES LEFT : "+result);
        }
	}

}
