package day9;

public class accessModifiers {

	public static void main(String[] args) {
		
		
		calMethods cm = new calMethods();
		
		System.out.println("sub is : "+cm.sub(5, 6));
		System.out.println("mul is : "+cm.mul(5, 3));
		System.out.println("mul is : "+cm.mul(6, 5));
		System.out.println("sum is : "+cm.sum(6, 3));
		//System.out.println("sub is ; "+cm.add(6,5,3));
		
		System.out.println("The Output before overriding is "  +cm.x);
		System.out.println("The Output before overriding is "  +cm.o);
		//cm.o = 15 ;
		cm.x = 30 ;
		System.out.println("The Output After overriding is "  +cm.x);

	}

}
