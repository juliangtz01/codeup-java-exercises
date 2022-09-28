import java.lang.Math;

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
    }
}
