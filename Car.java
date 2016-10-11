import java.util.Scanner;
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner
		Scanner input = new Scanner(System.in);
		//Prompt user to enter car model
		System.out.println("Enter Car Model: ");
		//Declare variables
		double carModel = input.nextDouble();
		//Prompt user to enter initial cost
		System.out.println("Enter initial cost: ");
		//Declare variables
		double initialcost = input.nextDouble();
		double  salestax;
		double discount;
		double total;
		double commission;
		double finalprice;
		
		//Formula
		salestax = (initialcost * .036);
		discount = ( (initialcost + salestax) * .15) ;
		total = initialcost + salestax - discount;
		commission = (total * .10);
		finalprice = total - commission;
	
		//Display results
		System.out.println("The Sales tax is: " + salestax);
		System.out.println("The discount is: " + discount);
		System.out.println("The commission is: " + commission);
		System.out.println("The Final Price is: " + finalprice);
		
	}

}
