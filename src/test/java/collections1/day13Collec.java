package collections1;

import java.util.ArrayList;
import java.util.LinkedList;

public class day13Collec {

	public static void main(String[] args) {
		ArrayList students = new ArrayList();
		
		
		// Restricting the collection 
		
		ArrayList<String> mailid  = new ArrayList<String>();
		
		// emailid.add(122);
		
		
		LinkedList students1 = new LinkedList();
		
		students1.add("Navin Sampath");
		students1.add("Akash");
		students1.add("Boomika");
		students1.add("Dhanalakshmi");
		students1.add("Ferin");
		students1.add("Hemanth");
		students1.add("Janani");
		students1.add("Jyoti");
		
		
		for(Object a1: students1)
		{
			System.out.println(a1);
		}
		
		System.out.println("********");
				
		for(int i = 0 ; i<students1.size();i++)
		{
			System.out.println(students1.get(i));
		}
		
		System.out.println("********");
		for( String c : mailid)
		{
			System.out.println(c);
		}
		
		
		
	
		students.add("Akash");
		students.add("Boomika");
		students.add("Dhanalakshmi");
		students.add("Ferin");
		students.add("Hemanth");
		students.add("Janani");
		students.add("Jyoti");
		students.add("Kalishwri");
		students.add("Leena");
		students.add("Malathi");
		students.add("Muthu Karthika");
		students.add("Raghul");
		students.add("Richard");
		students.add("Sugadarshini");
		students.add("Sindhu");
		students.add("Supraja");
			
		for(Object b :students )
		{
			System.out.println(b);
		}
		
		System.out.println("********");	
		// To get the data using index
		System.out.println(students.get(3));
		
		
		System.out.println("********");
		// Dynamically add using index
		
		students.add(3, "Navin Sampath");
		System.out.println(students.get(3));
		System.out.println(students.get(4));
		
		System.out.println(students.size());
		
		System.out.println(students.contains("Raghul"));
	
		
		
		

	}

}
