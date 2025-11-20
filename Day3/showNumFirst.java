package Day3;
//problem - 3
import java.util.Scanner;

public class showNumFirst {

	public static void main(String[] args) {
		String str=new String();
		Scanner sc=new Scanner(System.in);
		System.out.println("Give the String with combination of Number and Alphabet:");
		str=sc.nextLine();
		int len=str.length();
		String num="",alpha="";
		//num is used for storing Integers and alpha is used for storing Strings
		String result="";
		
		for(int i=0;i<len;i++) {
			char c=str.charAt(i);
			if(Character.isDigit(c)) {
				num=num+c;
			}else {
				alpha=alpha+c;
			}
		}
		result=num+alpha;
		System.out.println("The result is:"+result);
	}

}
