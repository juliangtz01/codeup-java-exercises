import java.awt.*;
import java.util.Random;
import java.util.Scanner;

/**
 * Game Development 101
 *
 * Welcome to the world of game development!
 *
 * You are going to build a high-low guessing game.
 * Create a class named HighLow inside of src.
 *
 * The specs for the game are:
 *
 * * Game picks a random number between 1 and 100.
 * * Prompts user to guess the number.
 * * All user inputs are validated.
 * * If user's guess is less than the number, it outputs "HIGHER".
 * * If user's guess is more than the number, it outputs "LOWER".
 * * If a user guesses the number, the game should declare "GOOD GUESS!"
 *
 * Hints
 *
 * Use the random method of the java.lang.Math class
 * to generate a random number.
 * Bonus
 *
 * Keep track of how many guesses a user makes.
 * Set an upper limit on the number of guesses.
 *
 *
 * **/

public class HighLow
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the world of game development!");
        System.out.println("The computer will generate a random number between 1 to 100 and you will try to guess the random number.");
        randomNumberGame();

    }

    public static void randomNumberGame()
    {
        Random randon = new Random();
        int guess = 0;
        int userNum = 0;
        int randNum = 1 + randon.nextInt(100);
        do
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a number between 1 to 100 to guess the random number: ");
            userNum = scanner.nextInt();

            if(userNum < 1 || userNum > 100)
            {
                System.out.println("\nThe number you entered is not within the range, please try again!!\n");
            }
            else if(userNum < randNum)
            {
                System.out.println("\nThe number you entered is lower than the random number, go HIGHER!!!\n");
                guess++;
            }
            else if(userNum > randNum)
            {
                System.out.println("\nThe number you entered is higher than the random number, go LOWER!!!\n");
                guess++;
            }
            else if(userNum == randNum)
            {
                guess++;
            }


        }while(userNum != randNum);

        System.out.printf("\nGOOD GUESS!!!, the random number was %d, your number was %d, and it took you %d guess%n", randNum, userNum, guess);
    }
}
