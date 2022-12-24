package day6Session;

public class strinMan {

	public static void main(String[] args) {
	
		
		String A = "This is sixth class";
		System.out.println(A);
		
		//Split it will split the words based on ur input 
		
		String[] title = A.split(" ");
				
		for(String B : title) 
		{
		System.out.println(B);
		}
		
		//Contains Methods
		
		
			System.out.println((A.contains("day")));
		

	}

}
