import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Scanner;

public class GuessTheNumberTest {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		GuessTheNumber game = new GuessTheNumber();
		game.play();
		String keepPlaying = "Y";

		do{
			System.out.println("Enter Y to keep playing otherwise enter N");
			keepPlaying = input.nextLine();
			if(keepPlaying.equalsIgnoreCase("Y")){
				System.out.println("*********New Game**********");
				game.play();
			} else {
				System.out.println("!!!!!Thank you for playing, please come again!!!!!!");
			}
		} while (keepPlaying.equalsIgnoreCase("Y"));
	}
}