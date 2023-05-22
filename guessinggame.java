
import java.util.Scanner;
public class guessinggame {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
	    int count = 0;
	    int a = 1 + (int) (Math.random() * 99);
	    int guess = 0;

	    System.out.println("Guess a number from 1 to 100:");

	    while (guess != a) {
	        guess = keyboard.nextInt();
	        count++;
	        if (guess > a) {
	            System.out.println("Lower, try again");
	        } else if (guess < a) {
	            System.out.println("Higher, try again");
	        }
	    }
	    System.out.println("It took you "
	        +  count + " tries to guess the correct number.");
	}

}

