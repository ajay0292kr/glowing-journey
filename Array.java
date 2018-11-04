import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
        int i,n;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n=in.nextInt();
        int [] a = new int[n];
        System.out.println("Please enter number:");
        for( i=0;i<n;i++)
         {
    	  
    	   a[i] = in.nextInt();
         }
        for(i=0;i<n;i++)
         {
    	   System.out.println(a[i]);
         }

	}

}
