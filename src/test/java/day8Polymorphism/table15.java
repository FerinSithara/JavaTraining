package day8Polymorphism;

import java.util.Scanner;

public class table15 {
	
		public static void main(String[] args) {
		
		int i, j, k;
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the number till you need for the table 15: ");
		j = s1.nextInt();
		
		for ( i =1; i <= j; i++)
		{
			k = i * 15;
			System.out.println(i +" * 15 = " + k);
		}

	}
	
	
}
