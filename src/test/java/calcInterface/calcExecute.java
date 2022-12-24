package calcInterface;

import java.util.Scanner;

public class calcExecute {

	public static void main(String[] args) {
		
		Scanner scc = new Scanner(System.in);
		calcMethods f = new calcMethods();
		String s;
		int op = 1;
		
		while(op == 1)
		{
			System.out.println("Enter the operation : ");
            s = scc.next();
            
            if(s.contains("add") || s.equalsIgnoreCase("add") || s.equalsIgnoreCase("addition") || s.contains("Add"))
            {
            	f.add();
            }
            
            else if(s.contains("sub") || s.equalsIgnoreCase("sub") || s.equalsIgnoreCase("subtraction") || s.contains("Sub"))
            {
            	f.sub();
            }
            
            else if(s.contains("mul") || s.equalsIgnoreCase("mul") || s.equalsIgnoreCase("multiplication") || s.contains("Mul"))
            {
            	f.mul();
            }
            
            else if(s.contains("div") || s.equalsIgnoreCase("div") || s.equalsIgnoreCase("division") || s.contains("Div"))
            {
            	f.div();
            }
            
            else
            {
               System.out.println("Enter the correct operation");
            }

          System.out.println("Enter 1 if you wish to continue the operations : ");
          op = scc.nextInt();
		}


	      
	      
	      
	      

	}

}
