package calculator;

import java.util.Scanner;

import calcInterface.inputException;

public class addArray {

	public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        int[] addip = new int[100]  ;
     	int ip;
     	//boolean errorFound = false;
     	System.out.println("Enter how many numbers to be added: ");
       	ip = sc1.nextInt();
      	System.out.println("Enter numbers : ");

         for (int l = 1; l <= ip ; l++)
          {
        	try
        	{
        		if(!sc1.hasNextInt())
        		{
        			//errorFound = true;

        			throw new inputException("add");
        		}
        		else
        			addip[l] = sc1.nextInt();
        	}
        	catch (inputException E)
        	{
    		    break;
        	}
        		 
     	  addip[l] = addip[l] + addip[l-1];
         }
        // if(errorFound == false)
                  System.out.println("The sum is: "+addip[ip]);
 		

	}

}
