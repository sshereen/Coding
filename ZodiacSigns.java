import java.util.Scanner;
public class ZodiacSigns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Prompt user to input the month of their birthday
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		int January = 1;
		int February = 2;
		int March = 3;
		int April = 4;
		int May = 5;
		int June = 6;
		int July = 7;
		int August = 8;
		int September = 9;
		int October = 10;
		int November = 11;
		int December  = 12;
		
		//Ask user what month they were born in
		System.out.println(" What month were you born?");
		int month = input.nextInt();
		
	    //Ask user what day
		System.out.println("In what day?");
		 int day = input.nextInt();
		
		 //The if else statement and displaying results
		if((month == 1) && (day >=20) || (month == 2) && (day <= 18)) {
			System.out.println("Your zodiac sign is Aquarius!");
		}else if ((month == 2) && (day >=19) || (month == 3)&& (day <=20)){
			System.out.println("Your zodiac sign is Pisces!");
		}else if ((month == 3) && (day >= 21) || (month == 4) && (day <=19)){
			System.out.println("Your zodiac sign is Aries!");
		}else if ((month == 4) && (day >= 20) || (month == 5) && (day <=20)){
			System.out.println("Your zodiac sign is Taurus!");
		}else if ((month == 5) && (day >= 21) || (month == 6) && (day <=20)){
			System.out.println("Your zodiac sign is Gemini!");
		}else if ((month == 6) && (day >= 21) || (month == 7) && (day <=22)){
			System.out.println("Your zodiac sign is Cancer!");
		}else if ((month == 7) && (day >= 23) || (month == 8) && (day <=22)){
			System.out.println("Your zodiac sign is Leo!");
		}else if ((month == 8) && (day >= 23) || (month == 9) && (day <=22)){
			System.out.println("Your zodiac sign is Virgo!");
		}else if ((month == 9) && (day >= 23) || (month == 10) && (day <=22)){
			System.out.println("Your zodiac sign is Libra!");
		}else if ((month == 10) && (day >= 23) || (month == 11) && (day <=21)){
			System.out.println("Your zodiac sign is Scorpio!");
		}else if ((month == 11) && (day >= 22) || (month == 12) && (day <=21)){
			System.out.println("Your zodiac sign is Sagittarius!");
		}else if ((month == 12) && (day > 0) || (month == 1) && (day <=20)){
			System.out.println("Your zodiac sign is Capricorn!");
		} else {
			System.out.println("Not correct input");
		}
			
	}

}
