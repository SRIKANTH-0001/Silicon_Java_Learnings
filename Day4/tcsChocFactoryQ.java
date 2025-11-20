package Day4;
//Problem No - 1
import java.util.Scanner;
public class tcsChocFactoryQ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of nums array:");
        int count=sc.nextInt();
        int nums[]=new int[count];
        
        System.out.println("Give %d values:"+count);
        int c=0;
        for(int i=0;i<count;i++){
            nums[i]=sc.nextInt();
            if(nums[i]!=0){
                nums[c++]=nums[i];
            }
        }
        
        while(c<nums.length){
            nums[c++]=0;
        }
        
       for(int i=0;i<count;i++){
           System.out.printf(nums[i]+" ");
       }

	}

}
