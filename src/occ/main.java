package occ;

import java.util.Scanner;
public class main {
    public static void main (String[]args)
    
    {
    	int atmnumber=593252;
    	int atm =2507;
    	
 

        System.out.println("=====**Welcome to  ATM Booth**=====");
        
        Scanner input = new Scanner (System.in);  
        
        System.out.print("Please enter your Card Number: ");
        int number = input.nextInt();
       
        
   
        System.out.print("Please enter your Pin Number: ");
        int pin = input.nextInt();
      
        
        if((atmnumber==number)&&(atm==pin)) {
        	
        	System.out.println("\n -----Successfully Login----- \n");
        }
        else {
         	
 			System.out.println("Incorrect ATM Number  "+number);
 			System.out.println("Incorrect PIN Number "+pin);
 			System.out.println("---Please Try Again---");
 			
 			System.out.println(" ");
         }
       
//        System.out.print("Please enter your Card Number: ");
//        int number = input.nextInt();
//       
//        
//   
//        System.out.print("Please enter your Pin Number: ");
//        int pin = input.nextInt();
//      
//        
//        if((atmnumber==number)&&(atm==pin)) {
//        	
//        	System.out.print("Successfully Login");
//        }
//        else {
//        	
//			System.out.println("Incorrect ATM Number  "+number);
//			System.out.println("Incorrect PIN Number "+pin);
//			
//			System.out.println(" ");
//        }

        Display display = new Display();
        display.display();

        Function ab = new Function();
        ab.function();

        Message ms = new Message();
        ms.ending_message();
    }
}
