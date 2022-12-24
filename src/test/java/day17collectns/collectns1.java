package day17collectns;

import java.util.ArrayList;
import java.util.Scanner;

public class collectns1 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);


		ArrayList mark = new ArrayList();
		
		System.out.println("Enter how many marks to be entered : ");
		
		int p = s1.nextInt();
		
		for (int i=0; i < p ; i++)
		 {
			 mark.add(s1.nextInt());
		 }
		System.out.println(mark.size());
		for(Object m : mark)
		{
			System.out.println(m);
		}
		
		for(int i=mark.size()-1; i<mark.size(); i-- )
		{
			if(i<0)
			{
				break;
			}
			else
			System.out.println(mark.get(i));
		}
		
		int m1=10;
		
		for(int j=0; j<7; j++)
		{
			System.out.println(m1);
			m1=m1+10;
		}
		//mark.add(90);
		//mark.add(70);
		//mark.add(80);
		//mark.add(100);
		
		

	}

}
