package calcInterface;

public class inputException extends Exception{
 
	
	//Requirement is to create customized  exception 
	public inputException(String sd)
	{
		System.out.println(sd +" Exception: Allow only numbers. Enter the correct input.");
	}
}
