package milestone9;

import java.util.Scanner;

public class NumberPattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc =new Scanner(System.in);
	        System.out.println("Enter no. of rows: ");
	        int n=sc.nextInt();
	        int k=1,m,l;
	        for(int i=1;i<=n;i++)
	        {
	        	l=1;
	        	m=(2*n-k);
	        	for(int j=1;j<=n+3;j++)
	        	{
	        		if(j<=m)
	        		{
	        			System.out.print(l);
	        		    l++;
	        		}
	        		else {
	        			System.out.print(" ");
	        		}
	        		
	        	}
	        	k=k+2;
	        	System.out.println("\n");
	        }
	}

}
