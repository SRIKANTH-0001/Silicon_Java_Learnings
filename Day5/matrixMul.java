package Day5;
//Problem No - 3
import java.util.Scanner;

public class matrixMul {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i,j,k;
		int fMatrix[][] =new int[3][3];
		int sMatrix[][] =new int[3][3];
		
		int rMatrix[][] =new int[3][3];
		
		System.out.println("Give the values of first Matrix:");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				fMatrix[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Give the values of second Matrix:");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				sMatrix[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				int sum=0;
				for(k=0;k<3;k++) {
					sum=sum+(fMatrix[i][k]*sMatrix[k][j]);
				}
				rMatrix[i][j]=sum;
			}
		}
		
		System.out.println("The Result is:");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.printf(rMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
