import java.util.*;
public class NelsonCheck 
{
	public static int countDigit(int a)
	{
		int c = 0 ;
		while(a>0)
		{
			a=a/10;
			c++;
		}
		return c;
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER A NUMBER TO CHECK WHETHER IT IS NELSON OR NOT : ");
		int n = in.nextInt(),d=0,r=0,flag = 0 ;
		r = n % 10 ;
		if(countDigit(n)>=3)
		{
			while(n>0)
			{
				d = n % 10 ;
				if(r != d)
				{
					flag=1;
				}	
				n = n / 10 ;
			}
			if(flag == 0)
				System.out.println("the number is nelson");
			else
				System.out.println("the number is not nelson");
		}
		else
		{
			System.out.println(" INVALID INPUT ");
		}
	}
}
