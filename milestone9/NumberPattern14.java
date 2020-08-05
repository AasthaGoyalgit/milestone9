package milestone9;

import java.util.Scanner;

public class NumberPattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =new Scanner(System.in);
	        System.out.println("Enter no. of rows: ");
	        int n=sc.nextInt();
	        int k;
	        for(int i=1;i<=n;i++)
	        {
	        	k=(i);
	        	for(int j=1;j<=n;j++)
	        	{
	        		if(j<=(n-i+1))
	        		{
	        			System.out.print(k);
	        		    
	        		}
	        		else
	        			System.out.println(" ");
	        		
	        	}
	        	System.out.println("\n");
	        }
	}

}
