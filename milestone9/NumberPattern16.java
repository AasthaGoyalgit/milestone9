package milestone9;

import java.util.Scanner;

public class NumberPattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =new Scanner(System.in);
	        System.out.println("Enter no. of rows: ");
	        int n=sc.nextInt();
	       int k,m;
	        for(int i=1;i<=n;i++)
	        {
	        	k=1;
        		m=0;
	        	
	        	for(int j=1;j<=n;j++)
	        	{
	        		
	        		if(j<=i)
	        		{
	        			if(i%2!=0)
	        			{
	        			    System.out.print(k);	
	        			    k=1-k;
	        			}
	        			else {
	        				
	        				System.out.print(m);
	        				m=1-m;
	        			}
//	        			k=1-k;
//	        			m=1-m;
	        		}
	        		else
	        			System.out.print("" );
	        		
	        	}
	        	System.out.println("\n");
	        }
	}

}
