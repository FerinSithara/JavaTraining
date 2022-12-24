package day10NewJoinersEmpPortal;

public abstract class officeRules {
	
	

	// Multiple Inheritance is not applicable to java
	// Java is giving u a short cut or an another way to achieve 
	// Multiple inheritance using Interface/Abstraction 
	// implements 
	// Interface it will not allow u to write the method
		
	
	// Abstraction it will allow the implementation part also it should be non abstract methods
	// Abstraction will allow you do create a dummy methods also without implementation
	// Abstract keyword is needed if you are creating any one abstract method also 
	// It will also allow non abstract methods also 
	// 100% Abstraction is getting failed so we are moving to interface
	// U cannot create a object
	
    public abstract void officeTimings();
    
    public void wearId()
    {
    	System.out.println("Wear ID card always");
    }
    
    public abstract void dressCode();
    
    public abstract void workLogs();
  

}
