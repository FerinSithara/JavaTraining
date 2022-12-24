package day16;

import java.util.HashMap;
import java.util.Scanner;

public class hashMap {

	public static void main(String[] args) {
		
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		int p = 0;


		HashMap<Integer, String> mp = new HashMap<Integer, String>();
		
		System.out.println("Enter the number of employees : ");
		try
		{
			if(!s2.hasNextInt())
			{
				throw new ipException("Number");
			}
			else
		    p = s2.nextInt();
		}
		catch(ipException e)
		{
			return;
		}
		    
		System.out.println("Enter the ID and Name : ");
		
		for(int i=0; i< p ; i++) 
		{
			try
			{
				if(!s2.hasNextInt())
				{
					throw new ipException("Input");
				}
				else
					mp.put(s2.nextInt(), s3.next());	
			}
			catch(ipException e)
			{
				break;
			}
		}
		for(Object m : mp.entrySet())
		{
			System.out.println(m);
		}
		
		for(Object k : mp.keySet())
		{
			System.out.println("The employee ID of "+mp.get(k)+" is "+k);
		}
		for(Object v :mp.values())
		{
			System.out.println(v);
		}
		//mp.get(1411);
	}

}
