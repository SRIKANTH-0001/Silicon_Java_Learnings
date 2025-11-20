package Day5;
//Problem No - 1
import java.util.Scanner;

public class arrInsDel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		System.out.printf("-------Welcome to do the Operatios in Array!-------%n%n");
		System.out.println("Give  the limit of the Array:");
		int n=sc.nextInt();
		
		System.out.printf("Give the %d values for the array:%n",n);
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		while(true) {
			System.out.println("1.Insertion \n2.Deletion\n3.Exit \n");
			int option=sc.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("Give the value to insert:");
				int val=sc.nextInt();
				
				System.out.println("Give the pos to insert from 1 to "+(n+1)+"");
				int pos=sc.nextInt();
				
				insert(arr,val,pos);
				
				break;
			case 2:
				System.out.println("Give the pos to delete from 1 to "+(n)+"");
				int pos1=sc.nextInt();
				
				delete(arr,pos1);
				break;
			case 3:
				System.out.println("Thanks for Coming!");
				break;
			default:
				System.out.println("Hope you had good Time!");
			}
		}
	}
	
	static void insert(int arr[],int val,int pos) {
		int n=arr.length+1;
		int newArr[]=new int[n];
		
		for(int i=0,j=0;i<newArr.length;i++) {
			if(i==pos-1) {
				newArr[i]=val;
			}else {
				newArr[i]=arr[j];
				j++;
			}
		}
		System.out.println("Array after insertion:");
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i]+" ");
		}
		System.out.println("\n");
	}
		
		static void delete(int arr[],int pos1) {
			int n=arr.length-1;
			int newArr[]=new int[n];
			
			for(int i=0,j=0;i<arr.length;i++) {
				if(i==pos1-1) {
					continue;
				}
				newArr[j++]=arr[i];
			}
			System.out.println("Array after Deletion");
			for(int i=0;i<newArr.length;i++) {
				System.out.print(newArr[i]+" ");
			}
	}

}