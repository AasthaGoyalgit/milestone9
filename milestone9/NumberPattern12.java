package milestone9;

import java.util.Scanner;

public class NumberPattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc =new Scanner(System.in);
	        System.out.println("Enter no. of rows: ");
	        int n=sc.nextInt();
	        int k=1,m;
	        for(int i=1;i<=n;i++)
	        {
	        	k=1;
	        	m=(n-i+1);
	        	for(int j=1;j<=n;j++)
	        	{
	        		if(j<=(n-i+1))
	        		{
	        		   if(i%2!=0)
	        		   {
	        			
	        			System.out.print(k);
	        			k++;
	        		   }
	        	   	   else
	        		    {
	        			
	        			System.out.print(m);
	        			m--;
	        		    }
	        		}
	        		
	        	}
	        	System.out.println("\n");
	        }
	} 

}
