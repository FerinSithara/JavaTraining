package day14;

public class finalizeMain {

	
	
	// Finalize :
	
		//  To delete or free up the memory of the unwanted object references
		// which is created or decommisioned or not being referred finalize method
		// Will be called before java is calling garbage collector method 
		

	public static void main(String[] args) {
		
		finalizeF d = new finalizeF();
		
		d = null;
		
		System.gc();

	}

}
