/* Author: Sameera Shereen
 * Date created: 10/1/16
 * Program summary: This program allows the user to enter a number or generate a random number from the computer to find out if it is an armstrong number.
 */
import java.util.Scanner; // import Scanner
import java.lang.Math;

public class Armstrong13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner input
		Scanner input = new Scanner(System.in);
		
		// Prompt user to choose if they want to enter a number or want the computer to generate a random number
		System.out.println("1. Do you want to enter a number? " + "\n" + "2. Do you want the computer to generate a random number" + "\n" + "Please choose option 1 or 2.");
		
		//Declaring the variables
		int choice = input.nextInt();
		int number;
		int number1;
		int number2;
		int number3;
		int number4;
		int number1Raised;
		int number2Raised;
		int number3Raised;
		int number4Raised;
		
		//Switch method, use to cases, one for entering the number, and one for generated computer random number
		switch (choice){
		case(1):
			System.out.println("Please enter the number: ");
		//Input for entering the number
		number = input.nextInt(); 
		
		// if and else statement for numbers 1 to 9, to see if it is an armstrong number and the formula 
		{ if (number >=1 && number <=9)
			if (Math.pow(number, 1) == number) {
				System.out.println("This is an armstrong number!");	
			}else
					System.out.println("This is not an armstrong number!");
		} 
		// if and else statement for numbers 10 to 99 to see if it is an armstrong number and the formula
		 if (number >=10 && number <=99){
			 number1 = Integer.parseInt(Integer.toString(number).substring(0,1));
				number2 = Integer.parseInt(Integer.toString(number).substring(1,2));
				
				number1Raised = (int) (Math.pow(number1, 2));
				number2Raised = (int) (Math.pow(number2, 2));
				
				if ((number1Raised + number2Raised) == number){
					System.out.println("This is an armstrong number");
				}else
					System.out.println("This is not an armstrong number");
			
		}
		 // if and else statement for numbers 100 to 999 to see if it is an armstrong number and the formula
		  if (number >= 100 && number <=999){
			 number1 = Integer.parseInt(Integer.toString(number).substring(0,1));
			 number2 = Integer.parseInt(Integer.toString(number).substring(1,2));
			 number3 = Integer.parseInt(Integer.toString(number).substring(2,3));
			 
			 number1Raised = (int) (Math.pow(number1, 3));
			 number2Raised = (int) (Math.pow(number2,3));
			 number3Raised = (int) (Math.pow(number3, 3));
			 
			 if ((number1Raised + number2Raised + number3Raised) == number) {
				 System.out.println("This is an armstrong number");
			 }else
				 System.out.println("This is not armstrong number");
		 }
		  //if and else statement for numbers 1000 to 9999 to see if it is an armstrong number and the formula
		 if (number >= 1000 && number <=9999) {
			 number1 = Integer.parseInt(Integer.toString(number).substring(0,1));
				number2 = Integer.parseInt(Integer.toString(number).substring(1,2));
				number3 = Integer.parseInt(Integer.toString(number).substring(2,3));
				number4 = Integer.parseInt(Integer.toString(number).substring(3,4));
				
				 number1Raised = (int) (Math.pow(number1, 4));
				 number2Raised = (int) (Math.pow(number2,4));
				 number3Raised = (int) (Math.pow(number3, 4));
				 number4Raised = (int) (Math.pow(number4, 4));
				 if ((number1Raised + number2Raised + number3Raised) == number) {
					 System.out.println("This is an armstrong number");
				 } else
					 System.out.println("This is not armstrong number");
		}
		 break;
		 
		case (2):
			//Random computer generated number formula
			 int random = (int)(Math.random()*10000);
				System.out.println("The computer generated random number is: " + "\n" + random);
				System.out.println("Please enter the computer generated random number to find out if it an armstrong number");
				number = input.nextInt();
				
				// if and else statement for numbers 1 to 9 to see if it is an armstrong number and the formula
				{ if (number >=1 && number <=9)
					if (Math.pow(number, 1) == number) {
						System.out.println("This is an armstrong number!");	
					}else
							System.out.println("This is not an armstrong number!");
				} 
				// if and else statement for numbers 10 to 99 to see if it is an armstrong number and the formula
				 if (number >=10 && number <=99){
					 number1 = Integer.parseInt(Integer.toString(number).substring(0,1));
						number2 = Integer.parseInt(Integer.toString(number).substring(1,2));
						
						number1Raised = (int) (Math.pow(number1, 2));
						number2Raised = (int) (Math.pow(number2, 2));
						
						if ((number1Raised + number2Raised) == number){
							System.out.println("This is an armstrong number");
						}else
							System.out.println("This is not an armstrong number");
					
				}
				 // if and else statement for numbers 100 to 999 to see if it is an armstrong number and the formula
				  if (number >= 100 && number <=999){
					 number1 = Integer.parseInt(Integer.toString(number).substring(0,1));
					 number2 = Integer.parseInt(Integer.toString(number).substring(1,2));
					 number3 = Integer.parseInt(Integer.toString(number).substring(2,3));
					 
					 number1Raised = (int) (Math.pow(number1, 3));
					 number2Raised = (int) (Math.pow(number2,3));
					 number3Raised = (int) (Math.pow(number3, 3));
					 
					 if ((number1Raised + number2Raised + number3Raised) == number) {
						 System.out.println("This is an armstrong number");
					 }else
						 System.out.println("This is not armstrong number");
				 }
				  //if and else statement for numbers 1000 to 9999 to see if it is an armstrong number and the formula
				 if (number >= 1000 && number <=9999) {
					 number1 = Integer.parseInt(Integer.toString(number).substring(0,1));
						number2 = Integer.parseInt(Integer.toString(number).substring(1,2));
						number3 = Integer.parseInt(Integer.toString(number).substring(2,3));
						number4 = Integer.parseInt(Integer.toString(number).substring(3,4));
						
						 number1Raised = (int) (Math.pow(number1, 4));
						 number2Raised = (int) (Math.pow(number2,4));
						 number3Raised = (int) (Math.pow(number3, 4));
						 number4Raised = (int) (Math.pow(number4, 4));
						 if ((number1Raised + number2Raised + number3Raised) == number) {
							 System.out.println("This is an armstrong number");
						 } else
							 System.out.println("This is not armstrong number");
				}
				 break;
			// Default
				 
		default: System.out.println("Invalid Choice, Please choose option 1 or 2");
		break;
			 
		
					
				
				
		 
		
	}
	}
}
