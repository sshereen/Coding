import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter two x coordinates
		System.out.println("Enter coordinate x1: ");
		System.out.println("Enter coordinate x2: ");
		double x1 = input.nextDouble();
		double x2 = input.nextDouble();
		
		//Prompt user to enter two y coordinates
		System.out.println("Enter coordinate y1: ");
		System.out.println("Enter coordinate y2: ");
		double y1 = input.nextDouble();
		double y2 = input.nextDouble();
		//Declare variables
		double distance;
		
		//Formula
		distance = Math.sqrt((x1-x2) *(x1-x2) + (y1-y2) * (y1-y2));	
		//Display results
		
		System.out.println("The distance is: " + distance);
		
	
		

	}

}
