import java.util.Scanner;

public class Sentence {

    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);

        System.out.println("Please enter a sentence");
        String sent1 = input.nextLine();

        String [] token = sent1.split(" ");
        int tokenLen = token.length;
        
        for (int i = tokenLen; i <= tokenLen; i--) {
            if(i > 0){
            System.out.println(token[i - 1]);
            }
        }
    }

}