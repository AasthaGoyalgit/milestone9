package milestone9;

import java.util.Scanner;

public class NumberPattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =new Scanner(System.in);
	        System.out.println("Enter no. of rows: ");
	        int n=sc.nextInt();
	       int k,m;
	        for(int i=1;i<=n;i++)
	        {
	        	k=1;
     		m=2;
	        	
	        	for(int j=1;j<=n;j++)
	        	{
	        		
	        		if(j<=i)
	        		{
	        			if(i%2!=0)
	        			{
	        			    System.out.print(k);	
	        			    k=k+2;
	        			}
	        			else {
	        				
	        				System.out.print(m);
	        				m=m+2;
	        			}
        		
	        		}
	        		else
	        			System.out.print("" );
	        		
	        	}
	        	System.out.println("\n");
	        }
	}

}
