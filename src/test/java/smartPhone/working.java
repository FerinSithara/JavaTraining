package smartPhone;

public class working {

	public static void main(String[] args) {


		iphone ip = new iphone();
		ip.facetime();
		ip.call();
		ip.switchoff();
		ip.switchon();

		//While compiling only java compiler knows which methods to be called
		//Static or compile time polymorphism 
		//Overriding 
		
		System.out.println("************");
		
		samsung sg = new samsung();
		sg.ultracamera();
		sg.call();
		sg.switchoff();
		sg.switchon();
		

	}

}
