import java.util.Scanner;
import java.security.SecureRandom;

public class GuessTheNumber {
    private Scanner input = new Scanner(System.in);
    private SecureRandom randomNumbers = new SecureRandom();
    private int numberOfGuess;
    
    public void play() {
    	int magicNumber = 1 + randomNumbers.nextInt(10);
    	numberOfGuess = 0;
		int guess = askForGuess();
		// Check if the guess is equal to the magicNumber
    	// if it is, display the guess is correct and tell how many guesses
    	// otherwise, tell the user if the guessed too high or too low
		// and ask for a new guess
		
		while (guess != magicNumber){
			if(guess < magicNumber){
				System.out.println("You guess was low");
				guess = askForGuess();
			} else {
				System.out.println("Your guess was high");
				guess = askForGuess();
			}
		}

		System.out.println(guess + " Is correct!!!!!!");
		System.out.println("You guessed correct in " + numberOfGuess + " guesses");
    }
    
    private int askForGuess() {
    	int guess = 0;
    	// Prompt for user's guess
    	// Make sure the guess is between 1 and 10 inclusive
    	// If the guess is an error, display the error message and ask for new guess
    	
    	// If the guess is a valid guess (1 - 10 inclusive)
		// increment numberOfGuess
		
		System.out.println("Please guess a number from 1 to 10");
		guess = input.nextInt();

		while ((guess < 1) || (guess > 10)){
			System.out.println("You entered a number less than 1 or greater than 10");
			System.out.println("Please enter a number from 1 to 10");
			guess = input.nextInt();
		}

		numberOfGuess ++;
		return guess;
    }
}