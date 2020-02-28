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
    }
    
    private int askForGuess() {
    	int guess = 0;
    	
    	// Prompt for user's guess
    	// Make sure the guess is between 1 and 10 inclusive
    	// If the guess is an error, display the error message and ask for new guess
    	
    	// If the guess is a valid guess (1 - 10 inclusive)
    	// increment numberOfGuess
    	return guess;
    }
	
}