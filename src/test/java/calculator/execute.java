package calculator;

import java.util.Scanner;

public class execute {

	public static void main(String[] args) {
		
		comMethods ferin = new comMethods();
		Scanner scn = new Scanner(System.in);
		
		int i =0, j=0, k=0, l=0, q=0, r=0, h = 0, t=0, ip, op = 1 ;
		double m=0, n=0, o=0, p=0, u=0, v=0, w=0, x=0;
		String s;
		boolean error = false;
					
		while(op == 1)
		{
			System.out.println("Enter the operation : ");
			s = scn.next();
			
		if(s.contains("add") || s.equalsIgnoreCase("add") || s.equalsIgnoreCase("addition") || s.contains("Add"))
		{
			Scanner scn1 = new Scanner(System.in);
			System.out.println("How many numbers needs to be added : ");
			ip = scn1.nextInt();
			
			if (ip == 2)
			{
				System.out.println("Enter the numbers to be added : ");
				try {
						h = scn1.nextInt();
				        i = scn1.nextInt();
					}
				catch(Exception E)
				{
					error = true;
					System.out.println("Enter the proper number "+E);
				}
				finally
				{
					System.out.println("Always use numbers");
				}
				if(error == false)
		        System.out.println("The addition is : " +ferin.addition(h, i));
		    }
			
			if (ip == 3)
			{
				try {
					 System.out.println("Enter the numbers to be added : ");
		             h = scn1.nextInt();
		             i = scn1.nextInt();
		             j = scn1.nextInt();
				    }
				catch(Exception E)
				{
					error = true;
					System.out.println("Enter the proper number "+E);
				}
				finally
				{
					System.out.println("Always use numbers");
				}
				if(error == false)
		        System.out.println("The addition is : " +ferin.addition(h, i, j));
		    }
		
			if (ip == 4)
			{
				try
				{
		        System.out.println("Enter the numbers to be added : ");
		        h = scn1.nextInt();
		        i = scn1.nextInt();
		        j = scn1.nextInt();
		        k = scn1.nextInt();
				}
				catch(Exception E)
				{
					error = true;
					System.out.println("Enter the proper number "+E);
				}
				finally
				{
					System.out.println("Always use numbers");
				}
				if(error == false)
		        System.out.println("The addition is : " +ferin.addition(h, i, j, k));
		    }
		}
		
		else if(s.contains("sub") || s.equalsIgnoreCase("sub") || s.equalsIgnoreCase("subtraction") || s.contains("Sub"))
		{
			Scanner scn2 = new Scanner(System.in);
			System.out.println("How many numbers needs to be subtracted : ");
			ip = scn2.nextInt();
			
			if (ip == 2)
			{
				try
				{
		        System.out.println("Enter the numbers to be subtracted : ");
		        l = scn2.nextInt();
		        q = scn2.nextInt();
				}
				catch(Exception E)
				{
					error = true;
					System.out.println("Enter the proper number "+E);
				}
				finally
				{
					System.out.println("Always use numbers");
				}
				if(error == false)
		        System.out.println("The subtraction is : " +ferin.subtraction(l, q));
			} 
			
			if (ip == 3)
			{
				try
				{
		        System.out.println("Enter the numbers to be subtracted : ");
		        l = scn2.nextInt();
		        q = scn2.nextInt();
		        r = scn2.nextInt();
				}
				catch(Exception E)
				{
					error = true;
					System.out.println("Enter the proper number "+E);
				}
				finally
				{
					System.out.println("Always use numbers");
				}
				if(error == false)
		        System.out.println("The subtraction is : " +ferin.subtraction(l, q, r));
			}
			
			if (ip == 4)
			{
				try
				{
		        System.out.println("Enter the numbers to be subtracted : ");
		        l = scn2.nextInt();
		        q = scn2.nextInt();
		        r = scn2.nextInt();
		        t = scn2.nextInt();
				}
				catch(Exception E)
				{
					error = true;
					System.out.println("Enter the proper number "+E);
				}
				finally
				{
					System.out.println("Always use numbers");
				}
				if(error == false)
		        System.out.println("The subtraction is : " +ferin.subtraction(l, q, r, t));
			}
		}
		
		else if(s.contains("mul") || s.equalsIgnoreCase("mul") || s.equalsIgnoreCase("multiplication") || s.contains("Mul"))
		{
			Scanner scn3 = new Scanner(System.in);
			System.out.println("How many numbers needs to be multiplied : ");
			ip = scn3.nextInt();
			
			if (ip == 2)
			{
				try
				{
		        System.out.println("Enter the numbers to be multiplied : ");
		        m = scn3.nextDouble();
		        n = scn3.nextDouble();
				}
				catch(Exception E)
				{
					error = true;
					System.out.println("Enter the proper number "+E);
				}
				finally
				{
					System.out.println("Always use numbers");
				}
				if(error == false)
		        System.out.println("The multiplication is : " +ferin.multiplication(m, n));
			}
			
			if (ip == 3)
			{
				try
				{
		        System.out.println("Enter the numbers to be multiplied : ");
		        m = scn3.nextDouble();
		        n = scn3.nextDouble();
		        o = scn3.nextDouble();
				}
				catch(Exception E)
				{
					error = true;
					System.out.println("Enter the proper number "+E);
				}
				finally
				{
					System.out.println("Always use numbers");
				}
				if(error == false)
		        System.out.println("The multiplication is : " +ferin.multiplication(m, n, o));
			}
			
			if (ip == 4)
			{
				try
				{
		        System.out.println("Enter the numbers to be multiplied : ");
		        m = scn3.nextDouble();
		        n = scn3.nextDouble();
		        o = scn3.nextDouble();
		        p = scn3.nextDouble();
				}
				catch(Exception E)
				{
					error = true;
					System.out.println("Enter the proper number "+E);
				}
				finally
				{
					System.out.println("Always use numbers");
				}
				if(error == false)
		        System.out.println("The multiplication is : " +ferin.multiplication(m, n, o, p));
			}
		}
		
		else if(s.contains("div") || s.equalsIgnoreCase("div") || s.equalsIgnoreCase("division") || s.contains("Div"))
		{
			Scanner scn4 = new Scanner(System.in);
			System.out.println("How many numbers needs to be divided : ");
			ip = scn4.nextInt();
			
			if (ip == 2)
			{
				try
				{
		        System.out.println("Enter the numbers to be divided : ");
		        u = scn4.nextDouble();
		        v = scn4.nextDouble();
				}
				catch(Exception E)
				{
					error = true;
					System.out.println("Enter the proper number "+E);
				}
				finally
				{
					System.out.println("Always use numbers");
				}
				if(error == false)
				System.out.println("The division is : " +ferin.division(u, v));
				
			}
			
			if (ip == 3)
			{
				try
				{
		        System.out.println("Enter the numbers to be divided : ");
		        u = scn4.nextDouble();
		        v = scn4.nextDouble();
		        w = scn4.nextDouble();
				}
				catch(Exception E)
				{
					error = true;
					System.out.println("Enter the proper number "+E);
				}
				finally
				{
					System.out.println("Always use numbers");
				}
				if(error == false)
		        System.out.println("The division is : " +ferin.division(u, v, w));
			}
			
			if (ip == 4)
			{
				try
				{
		        System.out.println("Enter the numbers to be divided : ");
		        u = scn4.nextDouble();
		        v = scn4.nextDouble();
		        w = scn4.nextDouble();
		        x = scn4.nextDouble();
				}
				catch(Exception E)
				{
					error = true;
					System.out.println("Enter the proper number "+E);
				}
				finally
				{
					System.out.println("Always use numbers");
				}
				if(error == false)
		        System.out.println("The division is : " +ferin.division(u, v, w, x));
			}
		}
		
		else
		{
			System.out.println("Enter the correct operation");
		}
		
		System.out.println("Enter 1 if you wish to continue the operations : ");
		op = scn.nextInt();
		
		}
		
	}

}
