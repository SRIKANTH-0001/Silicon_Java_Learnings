package Day3;

public class brainStromQues {

	public static void main(String[] args) {
		String s=50+50+"Chandru"+12+78;
		System.out.println("The result of 1st Problem is:"+s);
		
		String str="Apple"+5118;
		System.out.println("The result of 2nd Problem is:"+str);
		
		/*String name="Chandru";
		int age=20;
		System.out.println("he result of 3d Problem is"+age.concat(name));*/
		
		
		//Using Stringbuffer
		
		StringBuffer sb=new StringBuffer("");
		System.out.println("The capacity is:"+sb.capacity());
	}
}
