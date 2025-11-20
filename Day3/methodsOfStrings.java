package Day3;
//Problem -1
public class methodsOfStrings {

	public static void main(String[] args) {
		String a_Name="StUaRt LIttle";
		
		String randomStr=" The Power of Now ";
		
		System.out.println("Length of a given String:"+a_Name.length());
		
		System.out.println("The character at 0th index:"+a_Name.charAt(0));
		
		System.out.println("UpperCase of given string:"+a_Name.toUpperCase());
		
		System.out.println("LowerCase of given string:"+a_Name.toLowerCase());
		
		System.out.println("Replace first char of string with 'I':"+a_Name.replace("S", "I"));
		
		System.out.println("Use of trim() method:"+randomStr.trim());
		
		System.out.println("Check whether the a_Name Contains the string in the randomStr or Not:"+a_Name.contains(randomStr));
		
		System.out.println("Check whether the given string is empty or Not:"+randomStr.isEmpty());
		
		System.out.println("Is the ends with the char 't':"+randomStr.endsWith("LIttle"));
		
		System.out.println("What's the index of the char 'S':"+a_Name.indexOf("S"));
		
		System.out.println("What if I combine those two Strings:"+a_Name.concat(randomStr));
		

	}

}
