package day5Str;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// hard coding
		int i = 10;
		System.out.println("Before overriding the hard coded value is " +i);
		
		System.out.println("Enter the number that needs to overridden");
		i = sc.nextInt();

		System.out.println("After overridden the user input is " +i);
		
		//String 
		
				//Hard Coded Value
				
				String a = "Abcd" ;
				
				System.out.println(a);

				//Get input from the user and override the a as Java
				
				System.out.println("Enter the String that needs to overriden");
				
				a = sc.next();
				System.out.println("After overriding the output is" +a);
				

				

		

	}

}
