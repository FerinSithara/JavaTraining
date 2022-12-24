package dayFour;

import collections1.notesColle;

public class assertFn {

	public static void main(String[] args) {
		
		String s ="           Hi How are you";
		String b ;
		b = s.trim();
		System.out.println(b.indexOf("H"));
		//System.out.println(b.indexOf("How are"));
		System.out.println(b.indexOf("H", b.indexOf("H")+1));
		int a ;
		a = b.indexOf("H", b.indexOf("H")+1);
		System.out.println(b.indexOf("H", a+1));
		System.out.println(b.indexOf("h"));
		System.out.println(b.indexOf("i"));
		System.out.println(b.indexOf("i", b.indexOf("i")+1));
		
		String date = "27/11/2022";
		System.out.println(date.replace("5", "2"));
		
		System.out.println(date.isEmpty());
		
		String[] title = b.split(" ");
				
		for (String p : title)	
		{
			System.out.println(p);
		}
		
		System.out.println(b.contains("You"));
		
		if(b.contains("You") || b.equalsIgnoreCase("YOU"))
		{
			System.out.println("valid");
		}
		else
			System.out.println("Invalid");
		
		System.out.println(notesColle.i);
		notesColle.i = 20;
		System.out.println(notesColle.i);
	}

}
