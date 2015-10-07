import java.util.Scanner;

public class SquareDisplay {

	public static void main(String[] args) {
		final int MAX_SIZE = 15; //the maximum size square allowed.
		
		System.out.print("Enter the square size no greater than " + MAX_SIZE + ": ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		
		//Continue to ask the user for input while the input is invalid.
		while (size > MAX_SIZE) {
			//this is an error.
			System.err.print(size + " is invalid. Please try again: ");
			size = scanner.nextInt();
		} 
		 
		//Now, we have a valid input.
		System.out.println("Drawing a square of size: " + size);
		
		//TODO: Draw the square using embedded for loops.
	}

}
