package day16;

public class ipException extends Exception {
	
	public ipException(String sd)
	{
		if(sd == "Input")
		    System.out.println(sd +" exception : The employee ID should be in numbers");
		else
			System.out.println(sd +" exception : The employee numbers should be in integers");	
	}

}
