package dayFour;

public class strName {

	public static void main(String[] args) {
		
		
		String Name = "Ferin" ;
		String MiddleName = "Sithara" ;
		String lastname = "P M";
		
		// String Is immutable in Nature
		
				//Using string and its methods we can do multiple manipulations 
				
				// What ever we give in double quotes it will take as String 
				
				// It will not create multiple memories // Storage of memory will be reduce 
				
				//performance will be high 
				
				// String will not assign on its own we have to assign the data as it is immutable 
			
		
		String a = null;
        
		System.out.println("The Starting point is here:"+" " + a);
		
		a = Name.concat(" " +MiddleName);
		
		System.out.println("We are adding middle name:" +" "+ a);
		
		
		String Fullname = a;
	    
		

		
		a = a.concat(" "+lastname);
		System.out.println("My full name is" +" "+a);
		
		System.out.println(a);
		
		System.out.println(a.charAt(0));
		System.out.println(a.charAt(12));
		
		String substrinn = a.substring(0, 6);
		System.out.println(substrinn);
		
		
		String substrinn2 = a.substring(6, 13);
		
		String substrinn3 = a.substring(6);
		
		System.out.println("Substring2:" +" "+substrinn2);

		System.out.println("Substring3:" +" "+substrinn3);
		
		
		String b = null;
		String fn = "Minha";
		String mn = "Eshaal";
		String ln = "P A";
		
		b = fn.concat(" " +mn);
		System.out.println(b);
		b = b.concat(" " +ln);
		System.out.println(b);
		System.out.println(b.charAt(0));
		System.out.println(b.substring(6, 12));

	}

}
