package collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Marklist  {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
			 
		
		ArrayList subjects = new ArrayList();
		ArrayList id = new ArrayList();
		ArrayList Marks = new ArrayList();
		ArrayList Marks1 = new ArrayList();
		LinkedList B = new LinkedList();
		LinkedList details = new LinkedList();
		int l =0;
		
		subjects.add("Mathematics I");
		subjects.add("Mathematics II");
		subjects.add("Physics");
		subjects.add("Chemistry");
		subjects.add("Humanities");
		subjects.add("Computer Programming in C");
		subjects.add("Graphics");
		subjects.add("Mechanics");
		subjects.add("Basic EE");
		subjects.add("Civil & Mechanical workshop");
		subjects.add("Electrical workshop");
		
		B.add("Graduation");
		B.add("Department");
		B.add("College Name");
		B.add("University");
		B.add("Percentage");
		
		System.out.println("Number of subjects : "+subjects.size());
		
		System.out.println("Enter the Marks : ");
		for (int j=0; j < subjects.size(); j++)
		{
			Marks.add(Sc.nextInt()); 	
			
		}
						
		for (int i=0; i < subjects.size(); i++)
		{
			id.add(i+1);
			System.out.println(id.get(i)+" "+subjects.get(i)+" : "+Marks.get(i));		
		}
		
		System.out.println("Enter the details : ");
		for(int k=0; k < B.size(); k++)
		{
			details.add(Sc.next());
		}
		for(Object d : details)
		{
			System.out.println(d);
		}
		
		
			//Collections methods sort,reverse
		
		Collections.sort(subjects);
		for(Object k : subjects)
		{
			System.out.println(k);
		}
		
		Collections.reverse(subjects);
		for(Object k : subjects)
		{
			System.out.println(k);
		}
		
		
		//Copying marks to new arraylist
		Marks1.addAll(Marks);
		for(Object k : Marks1)
		{
			System.out.println(k);
		}
		
	}

}
