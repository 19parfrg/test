package testing;
import java.util.Scanner;
public class NirbhaySucc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Does Nirbhay suck? (1 if yes, 2 if no)");
		int responce =input.nextInt();
		if (responce==2) {
			System.out.println("You're wrong, he do suck");
		}
		else {
			System.out.println("Yeah he do suck");
		}

	}

}
