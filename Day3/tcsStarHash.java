package Day3;
//TCS Problem No-3

import java.util.Scanner;
public class tcsStarHash {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Give any String with * and #:");
	        String str=sc.nextLine();
	        int hashes=0,stars=0;
	        for(int i=0;i<str.length();i++){
	            if(str.charAt(i)=='#'){
	                hashes++;
	            }else if(str.charAt(i)=='*'){
	                stars++;
	            }
	        }
	        
	        int result=hashes-stars;
	        System.out.println(result);
	}

}
