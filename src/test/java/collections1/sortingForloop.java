package collections1;

import java.util.ArrayList;
import java.util.Scanner;

public class sortingForloop {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		System.out.println("Enter how many numbers : ");
		int p = sc1.nextInt();
		
		System.out.println("Enter numbers : ");
		
		for (int i=0; i<p; i++)
		{
			a.add(sc1.nextInt());
		}
		
		System.out.println("Size of ArrayList is "+a.size());
		
		
		int large =0;
		
		for (int j=0 ; j<a.size() ; j++)
		{
			if (a.get(j) > large)
					large = a.get(j);
					
		}
		
		System.out.println("Large number is "+large);

	}

}
