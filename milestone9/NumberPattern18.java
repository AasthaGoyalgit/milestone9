package milestone9;

import java.util.Scanner;

public class NumberPattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =new Scanner(System.in);
	        System.out.println("Enter no. of rows: ");
	        int n=sc.nextInt();
	       int k=1,m=0;
	        for(int i=1;i<=n;i++)
	        {
	        	k=m+i;
	        	for(int j=1;j<=n;j++)
	        	{
	        		
	        		if(j<=(n-i+1))
	        		{
	        		   System.out.print(k);
	        			k=k+2;
	        		}
	        		else
	        			System.out.print(" ");
	        		
	        	}
	        	m++;
	        	System.out.println("\n");
	        }
	}

}
