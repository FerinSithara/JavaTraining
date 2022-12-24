package day8Polymorphism;

public class calMain {

	public static void main(String[] args) {
		
		
		calMethds M = new calMethds();
		System.out.println(M.sum(5, 6));
		System.out.println(M.sum(2, 3, 4));
		System.out.println(M.sum(1, 3, 5, 6));
		
	    M.setAccount("13456");
		M.setPhonenumber("6363252415");
		
		System.out.println(M.getAccount());
		System.out.println(M.getPhonenumber());
		
		
	}
}