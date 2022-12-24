package day6Session;

public class arrays {

	public static void main(String[] args) {
		
		//Why we want to use array  ??
		
		String name1 = "Ferin Sithara";
		String name2 = "Abdul Jaffer";
		String name3 = "Minha Eshaal";
		String name4 = "Muadh Azmil";
		
 String[] family = {"Ferin Sithara", "Abdul Jaffer","Minha Eshaal","Muadh Azmil"};
 int[] rollnumber = {1,2,3,4};
 
  for (int i = 0; i<family.length; i++)
  {
	  System.out.println(family[i]);
  }
   //Enhanced For loop
  System.out.println("***************");
  
  for(String name : family)
  {
	  System.out.println(name);
  }
  
  for(int r : rollnumber)
  {
	  System.out.println(r);
  }
	}

}
