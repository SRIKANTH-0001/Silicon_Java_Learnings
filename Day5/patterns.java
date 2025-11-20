package Day5;
//Problem No - 2

public class patterns {

	public static void main(String[] args) {
		
		lHPyramid();
		rHPyramid();
		fullPyramid();
		
	}
	
	static void lHPyramid() {
		int n=5;
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void rHPyramid() {
		int n=5,space;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(space=1;space<=i;space++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
		static void fullPyramid() {
			int n=5;
			for(int i=0;i<=n;i++) {
				//Creating the space
				for(int j=i;j<n;j++){
					System.out.print(" ");
				}
				//printing the stars
				for(int k=1;k<=(2*i-1);k++) {
					System.out.print("*");
				}
				System.out.println();
			}
	}

}
