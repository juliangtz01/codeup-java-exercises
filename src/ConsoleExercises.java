import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {



        //1. Copy this code into your main method
        double pi = 3.14159;

        //Write some Java code that uses the variable pi to output the following: The value of pi is approximately 3.14.
        System.out.println("The value of pi is approximate " + pi);

        /**
        * Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
         *
         * What happens if you input something that is not an integer?
         * Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
         *
         * What happens if you enter less than 3 words?
         * What happens if you enter more than 3 words?
         * Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
         *
         * do you capture all the words?
         * Rewrite the above example using the nextLine method.
        *
        * */
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer value: ");
        int userInput = scanner.nextInt();
        System.out.println("The number you entered is " + userInput);

        System.out.print("\nPlease enter 3 words: ");
        String firstWord = scanner.next(), secondWord  = scanner.next(), thirdWord = scanner.next();

        System.out.println("\nThe first word is " + firstWord + "\nThe second word is " + secondWord + "\nThe third word is " + thirdWord);

        scanner.nextLine();

        System.out.print("\nPlease enter a sentence: ");
        String theSentence = scanner.nextLine();
        System.out.println("The sentence you entered is: " + theSentence);

        //Calculate the perimeter and area of Codeup's classroom

        /**
         * 1. Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
         *
         * Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
         *
         * *    Assume that the rooms are perfect rectangles.
         * *    Assume that the user will enter valid numeric data for length and width.
         *
         * 2. Display the area and perimeter of that classroom.
         *
         * The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
         */

        System.out.print("Please enter the length: ");
        String length = scanner.next();
        System.out.print("Please enter the width: ");
        String width = scanner.next();

        int area = Integer.parseInt(length) * Integer.parseInt(width);
        int perimeter = 2 * (Integer.parseInt(length) + Integer.parseInt(width));

        System.out.println();

        System.out.printf("The area of the classroom is %d, and the perimeter is %d", area, perimeter);






    }
}
