package smartPhones;

public class base implements iphone, samsung{

	public void facetime()
		{
			System.out.println("facetime is working");
		}
	    


	public void call() {
		System.out.println("Mobile is calling");                                            
		
	}

	public void switchon() {
		System.out.println("Mobile is switchingon");
		
	}

	public void switchoff() {
		System.out.println("Mobile is switchingoff");
		
	}
	
	private String accountno = "188310";


	public String getAccountno() {
		return accountno;
	}



	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}



	public void ultracamera() {
		System.out.println("The best resolution of a picture");
		
	}
}

