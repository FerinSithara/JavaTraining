package calcInterface;

import java.util.Scanner;

public class calcMethods implements addSub, mulDiv{
	
		
	public void mul() {
		
		 double[] mulip = new double[100]  ;	        	 		
         int ip2;
         boolean errorFound2 = false;
         Scanner J3 = new Scanner(System.in);
         
       //Entering how many numbers needs to be calculated
         System.out.println("Enter how many numbers to be multiplied: ");
         try
      	 {
      		 if(!J3.hasNextInt())
      		 {
      			  errorFound2 = true;
      			 throw new inputException("Mul");
      			
      		 }
      		 else
      			 ip2 = J3.nextInt();
      	 }
         catch(inputException E3)
      	 {
      		return;
      	 }
         
       //Entering the numbers
         System.out.println("Enter numbers : ");
         mulip[0] = 1;
         
         for (int m = 1; m <= ip2 ; m++)
         {
        	 try
         	 {
         		 if(!J3.hasNextDouble())
         		 {
         			  errorFound2 = true;
         			 throw new inputException("Mul");
         			
         		 }
         		 else
                      mulip[m] = J3.nextDouble();
         	 }
        	 catch(inputException E3)
        	 {
        		 break;
        	 }
           mulip[m] = mulip[m] * mulip[m-1];
     	 }
            		
				if(errorFound2 == false)
				    System.out.println("The mul is: "+mulip[ip2]);
	}

	public void div() {
		
		 double[] divip = new double[100]  ;
         int ip3;
         boolean errorFound3 = false;
         Scanner J4 = new Scanner(System.in);
         
         //Entering how many numbers needs to be calculated
         System.out.println("Enter how many numbers to be divided: ");
         try
      	 {
      		 if(!J4.hasNextInt())
      		 {
      			  errorFound3 = true;
      			 throw new inputException("Div");
      			
      		 }
      		 else
      			 ip3 = J4.nextInt();
      	 }
         catch(inputException E4)
      	 {
      		return;
      	 }
         
       //Entering the numbers         
         System.out.println("Enter numbers : ");
         try
     	 {
     		 if(!J4.hasNextDouble())
     		 {
     			  errorFound3 = true;
     			 throw new inputException("Div");
     			
     		 }
     		 else
         divip[0] = J4.nextDouble();
     	 }
         catch(inputException E4)
     	 {
     		return;
     	 }
         divip[1] = 1;

         for (int n = 2; n <= ip3 ; n++)
         {
        	 try
         	 {
         		 if(!J4.hasNextDouble())
         		 {
         			  errorFound3 = true;
         			 throw new inputException("Div");
         			
         		 }
         		 else
                      divip[n] = J4.nextDouble();
         	 }
        	 catch(inputException E4)
        	 {
        		 break;
        	 }
           divip[n] = divip[n] * divip[n-1];	 			
         } 		
         
         divip[ip3] = divip[0] / divip[ip3];
         
         if(errorFound3 == false)
                System.out.println("The div is: "+divip[ip3]);
	}

	public void add() {
		
		int[] addip = new int[100]  ;
     	int ip;
     	boolean errorFound = false;
     	Scanner J1 = new Scanner(System.in);
     	
     	 //Entering how many numbers needs to be calculated 
     	System.out.println("Enter how many numbers to be added: ");
     	 try
      	 {
      		 if(!J1.hasNextInt())
      		 {
      			  errorFound = true;
      			 throw new inputException("Add");
      			
      		 }
      		 else
      			 ip = J1.nextInt();
      	 }
     	catch(inputException E1)
      	 {
      		return;
      	 }
       	
      //Entering the numbers
       	System.out.println("Enter numbers : ");
              	
         for (int l = 1; l <= ip ; l++)
          {
        	 try
        	 {
        		 if(!J1.hasNextInt())
        		 {
        			 errorFound = true;
        			 throw new inputException("Add");
        		 }
        		 else
        	         addip[l] = J1.nextInt();
        	 }
        	 catch(inputException E1)
        	 {
        		 break;
        	 }
        	  addip[l] = addip[l] + addip[l-1];
          }
         if(errorFound == false)
             System.out.println("The sum is: "+addip[ip]);
         
     }
	

	public void sub() {
		
		  int[] subip = new int[100]  ;
          int ip1;
          boolean errorFound1 = false;
          Scanner J2 = new Scanner(System.in);
          
          //Entering how many numbers needs to be calculated
          System.out.println("Enter how many numbers to be subtracted: ");
          try
      	 {
      		 if(!J2.hasNextInt())
      		 {
      			  errorFound1 = true;
      			 throw new inputException("Sub");
      			
      		 }
      		 else
      			 ip1 = J2.nextInt();
      	 }
          catch(inputException E2)
      	 {
      		return;
      	 }
          
          
          //Entering the numbers
          System.out.println("Enter numbers : ");
          try
     	 {
     		 if(!J2.hasNextInt())
     		 {
     			  errorFound1 = true;
     			 throw new inputException("Sub");
     			
     		 }
     		 else
                  subip[0] = J2.nextInt();
     	 }
          catch(inputException E2)
     	 {
     		return;
     	 }
          

          for (int k = 2; k <= ip1 ; k++)
          {
        	  try
          	 {
          		 if(!J2.hasNextInt())
          		 {
          			 errorFound1 = true;
          			 throw new inputException("Sub");
          		 }
          		 else
                     subip[k] = J2.nextInt();
          	 }
        	  catch(inputException E2)
          	 {
          		 break;
          	 }
            subip[k] = subip[k] + subip[k-1];
          }
          subip[ip1] = subip[0] - subip[ip1] ;
          
          if(errorFound1 == false)			
               System.out.println("The sub is: "+subip[ip1]);
		
	}
	
}
	
	

