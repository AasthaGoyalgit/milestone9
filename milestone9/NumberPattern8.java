package milestone9;

import java.util.Scanner;

public class NumberPattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc =new Scanner(System.in);
	        System.out.println("Enter no. of rows: ");
	        int n=sc.nextInt();
	        int k;
	        for(int i=1;i<=n;i++)
	        {
	        	k=n;
	        	for(int j=1;j<=n;j++)
	        	{
	        		if(j<=i)
	        		{
	        			System.out.print(k);
	        		    k--;
	        		}
	        		else
	        			System.out.println(" ");
	        		
	        	}
	        	System.out.println("\n");
	        }
	}

}
