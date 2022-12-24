package day5Str;

public class strManip {

	public static void main(String[] args) {
		
		
		String a = "              Hi How are you";
        
		System.out.println(a);
		
		// Trim
		
		String b = null;
		
		b = a.trim();
		System.out.println(b);
		
		//length
		System.out.println(b.length());
		
		//index of
		System.out.println(a.indexOf("H"));
		
		// Index of  to print the second occurances

		
		System.out.println(a.indexOf("H", a.indexOf("H")+1));
		
		
				
				int three = a.indexOf("H", a.indexOf("H")+1);
				
				//Index of third occurance
				
				System.out.println(a.indexOf("H", three+1));
				
				int four = a.indexOf("H", three+1) ;
				
				// ==
				
				//Equals 
				
				System.out.println(a.equals(b));
				
				//Equals Ignore capital case
				
				String small = "hi how r u" ;
				String cap = "HI HOW R U"; 
				
				System.out.println(small.equalsIgnoreCase(cap));
				
				
				// Replacing a character 
				
				String date = "08-11-2022" ;
				System.out.println(date);
				System.out.println(date.replace("-", "/"));
				
				
				}

}
