/*	Question 7
	Write a program to create an array to store 10 integers and print the largest integer and
	the smallest integer in that array. 
 */
import java.util.*;
public class Array1
{
	public static void main(String args[])
	{
		 int n, c, d, swap;
		    Scanner in = new Scanner(System.in);
		 
		    System.out.println("Input number of integers to sort");
		    n = in.nextInt();
		 
		    int array[] = new int[n];
		 
		    System.out.println("Enter " + n + " integers");
		 
		    for (c = 0; c < n; c++) 
		      array[c] = in.nextInt();
		 
		    for (c = 0; c < ( n - 1 ); c++) 
		    {
		      for (d = 0; d < n - c - 1; d++)
		      {
		        if (array[d] > array[d+1]) /* For descending order use < */
		        {
		          swap       = array[d];
		          array[d]   = array[d+1];
		          array[d+1] = swap;
		        }
		      }
		    }
		 
		    System.out.println("Sorted list of numbers");
		 
		    for (c = 0; c < n; c++) 
		      System.out.println(array[c]);
		    System.out.println("the largest integer : "+array[n-1]);
		    System.out.println("the smallest integer : "+array[0]);
	}
}
