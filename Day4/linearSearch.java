package Day4;
//Problem No - 2
import java.util.Scanner;
public class linearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of the Array:");
        int count=sc.nextInt();
        System.out.println("Give the key to find in array:");
        int key=sc.nextInt();
        
        System.out.println("Now,You can give %d elements of an array:"+count);
        int arr[]=new int[count];
        for(int i=0;i<count;i++){
            arr[i]=sc.nextInt();
        }
        
        int result=linearSearch(arr,key);
        
        if(result!=-1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
    static int linearSearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
