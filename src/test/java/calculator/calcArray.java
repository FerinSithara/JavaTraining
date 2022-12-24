package calculator;

import java.util.Scanner;

public class calcArray {

	        public static void main(String[] args) {

	        Scanner sc1 = new Scanner(System.in);
	        int op = 1;
	        String s;
	        
	        while(op == 1)
			{
				System.out.println("Enter the operation : ");
	            s = sc1.next();
	            
			    //Addition**********************************************	
			               if(s.contains("add") || s.equalsIgnoreCase("add") || s.equalsIgnoreCase("addition") || s.contains("Add"))
			                     {
				        
	                                int[] addip = new int[100]  ;
	                             	int ip;
	       	
	 		                        System.out.println("Enter how many numbers to be added: ");
	 	                          	ip = sc1.nextInt();
	 	                         	System.out.println("Enter numbers : ");
	 			 		
	 		                        for (int l = 1; l <= ip ; l++)
	 	 	                        {
	 		                       	  addip[l] = sc1.nextInt();
	 		                    	  addip[l] = addip[l] + addip[l-1];
	 			                    }
	 		
	 		                        System.out.println("The sum is: "+addip[ip]);
			                     }
			
			//Subtraction********************************************
			              else if(s.contains("sub") || s.equalsIgnoreCase("sub") || s.equalsIgnoreCase("subtraction") || s.contains("Sub"))
			                     {
	 			 		
	 		                        int[] subip = new int[100]  ;
	                                int ip1;
	         
	 		                        System.out.println("Enter how many numbers to be subtracted: ");
	 		                        ip1 = sc1.nextInt();
	 		                        System.out.println("Enter numbers : ");
	 		                        subip[0] = sc1.nextInt();
	 	
	 		                        for (int k = 2; k <= ip1 ; k++)
	 		                        {
	 			                      subip[k] = sc1.nextInt();
	 			                      subip[k] = subip[k] + subip[k-1];
	 		                        }
	 		
	 		                        subip[ip1] = subip[0] - subip[ip1] ;
	 				 				
	 		                        System.out.println("The sub is: "+subip[ip1]);
			                    }
			
			//Multiplication*******************************************
			             else if(s.contains("mul") || s.equalsIgnoreCase("mul") || s.equalsIgnoreCase("multiplication") || s.contains("Mul"))
			                     {
	 			 		
	 		                         double[] mulip = new double[100]  ;	        	 		
	 		                         int ip2;
	 		
	 		                         System.out.println("Enter how many numbers to be multiplied: ");
	 		                         ip2 = sc1.nextInt();
	 		                         System.out.println("Enter numbers : ");
	 		                         mulip[0] = 1;
	 		
	 		                         for (int m = 1; m <= ip2 ; m++)
	 		                         {
	 			                       mulip[m] = sc1.nextDouble();
	 			                       mulip[m] = mulip[m] * mulip[m-1];
	 			                     } 		
	 					 				
	 		                         System.out.println("The mul is: "+mulip[ip2]);
			                      }
			
			//Division**************************************************
			             else if(s.contains("div") || s.equalsIgnoreCase("div") || s.equalsIgnoreCase("division") || s.contains("Div"))
			                      {
	 		 		
	 		                         double[] divip = new double[100]  ;
	                                 int ip3;
	        
	 		                         System.out.println("Enter how many numbers to be divided: ");
	 		                         ip3 = sc1.nextInt();
	 		                         System.out.println("Enter numbers : ");
	 		                         divip[0] = sc1.nextDouble();
	 		                         divip[1] = 1;
	 		
	 		                         for (int n = 2; n <= ip3 ; n++)
	 		                         {
	 			                       divip[n] = sc1.nextDouble();
	 			                       divip[n] = divip[n] * divip[n-1];	 			
	 		                         } 		
	 		                         
	 		                         divip[ip3] = divip[0] / divip[ip3];
	 		                         System.out.println("The div is: "+divip[ip3]);
	 		                      }
			
		               	 else
			                      {
				                     System.out.println("Enter the correct operation");
			                      }
			
			  System.out.println("Enter 1 if you wish to continue the operations : ");
			  op = sc1.nextInt();
			
			}
	 		

		}
}

	


