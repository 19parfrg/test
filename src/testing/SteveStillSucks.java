package testing;
import java.util.Scanner;
public class SteveStillSucks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String steve = "steve";
		System.out.println("What is your first name?");
		String test = input.nextLine();
		test=test.toLowerCase();
		
		if(test.equals(steve)){
			System.out.println("You like men! and u suck (in between a mans legs)");
		}else{
			System.out.println("You are ok I guess.");
		}

	}

}
