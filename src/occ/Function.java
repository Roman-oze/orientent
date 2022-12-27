package occ;

import java.util.Scanner;
   public class Function {
    Scanner input = new Scanner (System.in);
      int op = input.nextInt();
    
  
           int balance =100000,withdraw=0;
    		  int Deposite;
     
 
        void function(){
 
        
        while(true) {
        	

        	
			System.out.println("=====***(Automated Teller Machine)***====== ");
			System.out.println("Choosen 1 for withdraw ");
			System.out.println("Choosen 2 for Deposit");
			System.out.println("Choosen 3 for Check Balance");
			System.out.println("Choosen 4 for Exit ");
			System.out.println("Choosen the operation what you want ");
			System.out.println("____________________________________________");
		
			int n = input.nextInt();
			System.out.println(" You Press-->"+n);
			
			  switch(n) {
			  
			   case 1 :
				System.out.println(" Enter money to be  withdrawal :  ");
			if(balance >= withdraw) {
					
					balance = balance - withdraw;
//					int sum = balance;
//					System.out.println(" "+sum);
					System.out.println("Your Money Succeessfully withdraw");
				
					System.out.println(" ");
			    	}
			
		            else {
					System.out.println(" Choosen 1 for withdraw ");
					System.out.println(" Insufficient Money  ");

				}
				System.out.println(" ");
				break;
				
			case 2 :
				System.out.print(" Enter money to be Deposited : ");
                     Deposite = input.nextInt();
                     balance = balance + Deposite;
        			System.out.println(" Total Balance : "+balance);
        			System.out.println(" Your Money Succeessfully Deposited ");
        			System.out.println("\n ");
        			
        			break;
        			
			case 3 :
				System.out.println(" Balance : "+balance);
				System.out.println(" ");
				break;
				
			case 4 :
				System.exit(0);
				
			 default:
				 System.out.println("\nWrong option. Thank you!");
        }
             }
            
       }
             
     }
    

