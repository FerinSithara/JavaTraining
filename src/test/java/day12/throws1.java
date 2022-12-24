package day12;

import java.util.Scanner;

public class throws1 {
	
	
	// TRY BLOCK --  IT will Try to execute a method block if it is getting 
		// blocked or an error it will throw an exception 
			
		// CATCH BLOCK -- It will Catch the exception which is thrown by the 
		// try block and it will resume the execution 
			
		//Finally Block -- How ever the codes are running finally block will be executed with the
		// try catch 
		
		// Throw -- User defined Exception 
		
		// Throws -- It will throws an exception it not resume the program

	
	public static int add1(int k , int p) throws MatchException
	{
		int a ;
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the Number to add");
		k = ss.nextInt();
		System.out.println("Enter the Number to add");
		p = ss.nextInt();
		a= k + p;
		System.out.println("sum is "+a);
		return a ;
	}


}
