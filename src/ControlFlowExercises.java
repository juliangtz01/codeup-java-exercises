import java.util.Scanner;

public class ControlFlowExercises {


    public static void main(String[] args)
    {
        /**
         * 1. Loop Basics
         *
         *  a. While
         *
         * Create an integer variable i with a value of 5.
         * Create a while loop that runs so long as i is less than or equal to 15
         * Each loop iteration, output the current value of i, then increment i by one.
         * Your output should look like this:
         *
         * 5 6 7 8 9 10 11 12 13 14 15
         **/
//        int i = 5;
//        while(i <= 15)
//        {
//            System.out.println(i++);
//        }
//
//        System.out.println();

        //refactoring the while loop above with a for loop
        for(int x = 5; x <= 15; x++)
        {
            System.out.println(x);
        }

        System.out.println();

        /**
         * 1. Loop Basics
         *
         * b. Do While
         *
         * Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
         * Alter your loop to count backwards by 5's from 100 to -10.
         * Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
         *
         *  2
         *  4
         *  16
         *  256
         *  65536
         * For
         *
         * Refactor the previous two exercises to use a for loop instead.
         **/
//        int start = 105;
//        do
//        {
//            System.out.println(start -= 5);
//
//        }while(start >= -5);
        for(int x = 100; x >= -5; x--)
        {
            System.out.println(x);
        }

        System.out.println();

//        long num = 2;
//
//        do
//        {
//            System.out.println(num);
//
//            num = num * num;
//
//        }while(num <= 1000000);

        long num = 2;

        for(long x = 0; x <= 100000; x++)
        {
            if(num == 65536)
            {
                System.out.println(num);
                break;
            }
            else
            {
                System.out.println(num);
            }
            num *= num;
        }

        /**
         * 2. Fizzbuzz
         *
         * One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
         *
         * *    Write a program that prints the numbers from 1 to 100.
         * *    For multiples of three: print ???Fizz??? instead of the          number.
         * *    For the multiples of five: print ???Buzz???.
         * *    For numbers which are multiples of both three and five:      print ???FizzBuzz???.
         **/
        System.out.println();
        for(int x = 1; x <= 100; x++)
        {
            if(x % 3 == 0 && x % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if(x % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if(x % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(x);
            }
        }

         /**
          ** 3. Display a table of powers.
         *
         * *    Prompt the user to enter an integer.
         * *    Display a table of squares and cubes from 1 to the           value entered.
         *      Ask if the user wants to continue.
         *      Assume that the user will enter valid data.
         *      Only continue if the user agrees to.
          *
         * Example Output
         *
         *
         * What number would you like to go up to? 5
         *
         * Here is your table!
         *
         * number | squared | cubed
         * ------ | ------- | -----
         * 1      | 1       | 1
         * 2      | 4       | 8
         * 3      | 9       | 27
         * 4      | 16      | 64
         * 5      | 25      | 125
          **/
        System.out.println();

        Scanner getNumber = new Scanner(System.in);

        System.out.print("What number would you like to go upt to? ");
        int theNumber = getNumber.nextInt();

        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for(int x = 1; x <= theNumber; x++)
        {
            System.out.printf("%d      | %d       | %d    %n", x, x * x, (x * x) * x);
        }

         /** Convert given number grades into letter grades.
         *
         **  Prompt the user for a numerical grade from 0 to 100.
         **  Display the corresponding letter grade.
         **  Prompt the user to continue.
         **  Assume that the user will enter valid integers for the       grades.
         **  The application should only continue if the user agrees to.
         **  Grade Ranges:
         *
         * A : 100 - 88
         * B : 87 - 80
         * C : 79 - 67
         * D : 66 - 60
         * F : 59 - 0
          **/
        System.out.println();

        String continueForward = "";
        do
        {
            Scanner theGrade = new Scanner(System.in);
            System.out.print("Please enter a numerical grade from 0 to 100: ");
            int grade = theGrade.nextInt();

            if(grade >= 88)
                System.out.println("The student got an A");
            else if(grade >= 80 && grade <= 87)
                System.out.println("The student got a B");
            else if(grade <= 79 && grade >= 67)
                System.out.println("The student got a C");
            else if(grade <= 66 && grade >= 60 )
                System.out.println("The student got a D");
            else
                System.out.println("The student got a F");

            System.out.println();
            Scanner proceed = new Scanner(System.in);
            System.out.print("Do you want to continue y / n?: ");
            continueForward = proceed.next();

        }while(continueForward.equals("y"));

         /**
         * Bonus
         *
         * Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).
         **/
    }
}
