package Day5;
//Problem No - 4
import java.util.Scanner;

public class traineeFit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int oxygenLevels[][]=new int[3][3];
		int tAvg[]=new int[3];
		int maxAvg=0;
		
		for(int i=0;i<3;i++) {
			int sum=0;
			boolean invalidInput=false;
			for(int j=0;j<3;j++) {
				int oxygen=sc.nextInt();
				if(oxygen>=1 && oxygen<=100) {
					oxygenLevels[i][j]=oxygen;
					sum+=oxygen;
				}else {
					oxygenLevels[i][j]=0;
					invalidInput=true;
					
				}
			}
			
			if(invalidInput) {
				System.out.println("INVALID INPUT!");
			}
			
			tAvg[i]=Math.round((float)sum/3);
			if(tAvg[i]>maxAvg) {
				maxAvg=tAvg[i];
			}
			
			if(maxAvg<70) {
				System.out.println("All Trainees are Physically Unfit!");
				return;
			}
			for(int k=0;k<3;k++) {
				if(tAvg[k]==maxAvg) {
					System.out.println("Trainee Number:"+(k+1));
				}
			}
			
		}
	}

}
