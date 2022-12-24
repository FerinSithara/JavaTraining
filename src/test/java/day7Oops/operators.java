package day7Oops;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		
		
		// % , && , ||
		
				// % Modulus Means - It will give the reminder of two numbers 
		
		int j = 3;
		System.out.println(j%2);
		
		// Program to print even numbers 
		// User needs to provide an input 
		// Even Numbers - 2/4/6/8/10 
		Scanner sc = new Scanner(System.in);
         int i;
         
         System.out.println("Enter the number: ");
         i = sc.nextInt();
         
         if(i%2 == 0)
         {
        	 System.out.println("the number is even " +i);
         }
         else
         {
        	 System.out.println("The number is odd");
         }
         
         
      // &&
         
         String s1 = "Java";
         
         System.out.println(s1.contains("J"));
         System.out.println(s1.contains("a"));
         
         if (s1.contains("J") && s1.contains("a"))
         {
        	 System.out.println("conditions are valid");
         }
         else
         {
        	 System.out.println("conditions are invalid");
         }
         
      // ||
 		
 		if (s1.contains("J")|| s1.contains("p"))
 		{
 			System.out.println("Valid Validations");
 		}
 		else
 		{
 			System.out.println("Not a valid validations");
 		}
 		
 		int[] addip = new int[10]  ;
 		
 		int ip;
 		System.out.println("Enter hw mny ip : ");
 		ip = sc.nextInt();
 		System.out.println("Enter numbers : ");
 		
 		for (int l = 1; l <= ip ; l++)
 		{
 			addip[l] = sc.nextInt();
 			
 		}
 		
 		for(int l = 1; l <= ip ; l++)
 		{
 			System.out.println(addip[l]);
 		  addip[l] = addip[l]+addip[l-1];
 		}
 		System.out.println(addip[ip]);
 		
 	
 		

	}

}
