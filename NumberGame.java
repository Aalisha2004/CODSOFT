import java.util.Random;
import java.util.Scanner;

public class NumberGame{
    private static final int MAX_ATTEMPTS=3;
    private static final int MIN_RANGE=1;
    private static final int MAX_RANGE=100;

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int roundsPlayed=0;
        int roundsWon=0;

        boolean playAgain;
        do {
            roundsPlayed++;
            int randomNumber=random.nextInt(MAX_RANGE-MIN_RANGE+1)+MIN_RANGE;
            boolean guessedCorrectly=false;
            int attempts=0;

            System.out.println("Round "+roundsPlayed);
            System.out.println("Guess the number between "+MIN_RANGE+" and "+MAX_RANGE);

            while(attempts<MAX_ATTEMPTS){
                System.out.print("Enter your guess: ");
                int userGuess=scanner.nextInt();
                attempts++;

                if(userGuess==randomNumber){
                    guessedCorrectly=true;
                    System.out.println("Congratulations! You guessed the number correctly.");
                    roundsWon++;
                    break;
                }else if(userGuess<randomNumber){
                    System.out.println("Too low! Try again.");
                }else{
                    System.out.println("Too high! Try again.");
                }
            }

            if(!guessedCorrectly){
                System.out.println("Sorry, you've used all your attempts. The number was "+ randomNumber+".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response=scanner.next();
            playAgain=response.equalsIgnoreCase("yes");

        }while(playAgain);

        System.out.println("Game Over!");
        System.out.println("Total Rounds Played: "+roundsPlayed);
        System.out.println("Rounds Won: "+roundsWon);

        scanner.close();
    }
}