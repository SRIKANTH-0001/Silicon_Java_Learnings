package Day4;
//Problem No-3
import java.util.Scanner;
public class binarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of the Array:");
        int count=sc.nextInt();
        System.out.println("Give the key to find in array:");
        int key=sc.nextInt();
        
        System.out.printf("Now,You can give %d elements of an array:",count);
        int arr[]=new int[count];
        for(int i=0;i<count;i++){
            arr[i]=sc.nextInt();
        }
        
        int result=binarySearch(arr,key);
        
        if(result!=-1){
            System.out.printf("Yes.It existed at index %d ",result);
        }else{
            System.out.println("No");
        }
    }
    
    static int binarySearch(int[] arr,int key){
    	int start=0,end=arr.length;
    	
        for(int i=0;i<arr.length;i++){
        	int mid=(start+end)/2;
        	if(key<arr[mid]) {
        		end=mid-1;
        	}else if(key>arr[mid]) {
        		start=mid+1;
        	}else if(key==arr[mid]){
                return mid;
            }
        }
        return -1;
    }
}
