package Day3;
//problem - 2 
import java.util.Scanner;

public class showStr {

	public static void main(String[] args) {
		String str=new String();
		Scanner sc=new Scanner(System.in);
		System.out.println("Type your Name:");
		str=sc.nextLine();
		int len=str.length();
		
		for(int i=0;i<len;i++) {
			System.out.println("The character at "+"index "+i+" "+str.charAt(i));
		}
		System.out.println("Your name is:"+str);
	}

}
