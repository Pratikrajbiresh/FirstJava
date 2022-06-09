import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayInput {
	public static void main(String[] args) {
		System.out.println("Program started");
		Scanner scanner = new Scanner(System.in);
		
		// exception only occurs when the programa is executed.
		
		System.out.println("Enter a number n : ");
		try {
		int n = scanner.nextInt();
		System.out.println(n%2 == 0 ? "Even" : "Odd");
		} catch(InputMismatchException e) {
			System.out.println("Error! Enter an Integer value only");
		}
		
		scanner.close();
		System.out.println("Program ended");
	}

}
