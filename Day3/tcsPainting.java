package Day3;
//Problem no- 2
import java.util.Scanner;

public class tcsPainting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Limit of Interior:");
        int interior=sc.nextInt();
        System.out.println("Limit of Exterior:");
        int exterior=sc.nextInt();
        
        double interVal,exterVal;
        double iVal=0.0,eVal=0.0;
        System.out.println("Give the Interior values:");
        for(int i=0;i<interior;i++){
            interVal=sc.nextDouble();
            iVal=iVal+interVal;
        }
        
        System.out.println("Give the Exerior values:");
       for(int i=0;i<exterior;i++){
            exterVal=sc.nextDouble();
            eVal=eVal+exterVal;
        }
           
        double result=(iVal*18)+(eVal*12);
        System.out.println("Total estimated Cost : "+result+" INR");
        

	}

}
