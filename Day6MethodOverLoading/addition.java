package Day6MethodOverLoading;

public class addition {

	public static void add(int a,int b) {
		int result=a+b;
		System.out.println("The addition of given number is:"+result);
	}
	public static void add(int a,int b,int c) {
		int result=a+b+c;
		System.out.println("The addition of given number is:"+result);
	}
	public static void add(int a,int b,int c,int d) {
		int result=a+b+c+d;
		System.out.println("The addition of given number is:"+result);
	}

	public static void main(String[] args) {
		
		add(2,3);
		add(2,3,457);
		add(2,3,75724,326);
	}

}
