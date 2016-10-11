import java.util.Scanner;
public class Kilometers {
//System uses kilometers rather than miles
//Convert kilometers to miles
//1 kilometer= 0.621mile
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kilometers;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the number of kilometers: ");
		kilometers = keyboard.nextDouble();
		double miles = kilometers * 0.621;
		System.out.println(kilometers + "kilometers is equal to " + miles + "miles ");
		
		
		
		
	

	}

}
