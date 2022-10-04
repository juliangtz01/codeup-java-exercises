import java.util.Random;
import java.util.Scanner;

public class MethodsExercises
{
    public static void main(String[] args)
    {
        int num1 = 6;
        int num2 = 3;

        System.out.printf("Adding %d and %d will result in %d.%n",num1,num2, add(num1, num2));
        System.out.printf("Subtracting %d and %d will result in %d.%n",num1, num2,subtract(num1, num2));
        System.out.printf("Multiplying %d and %d will result in %d.%n",num1,num2,multiply(num1, num2));
        System.out.printf("Dividing %d and %d will result in %d.%n",num1, num2,divide(num1, num2));
        System.out.printf("When dividing %d and %d, the remainder is %d.%n", num1, num2, remainder(num1, num2));
        System.out.println();
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        //prompt the user to enter an integer from 1 to 10
        System.out.print("Please enter a number ranging from 1 to 10: ");
        long factNumber = scanner.nextLong();
        factorial(factNumber);

        rollDice();

    }

    //add method will take in two arguments and will return the two numbers added together.
    public static int add(int num1, int num2)
    {
        return num1 + num2;
    }

    //subtract method will take in two arguments and will return the subtraction of the two numbers
    public static int subtract(int num1, int num2)
    {
        return num1 - num2;
    }

    //multiply method will take in two arguments and will return the product of the two numbers
    public static int multiply(int num1, int num2)
    {
        return num1 * num2;
    }

    //divide method will take in two arguments and will return the result of the two numbers being divided
    public static int divide(int num1,int  num2)
    {
        return num1 / num2;
    }

    //remainder method will take in two arguments and will return the remainder of the numbers being divided.
    public static int remainder(int num1, int num2)
    {
        return num1 % num2;
    }

    //Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given (1 - 10) range. If not, prompt the user to input their number again until the input is within range.
    public static int getInteger(int min, int max)
    {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();

        if(result >=1 && result <= 10)
        {
            System.out.printf("The number you entered was %d.%n", result);
            return result;
        }
        else
        {
            System.out.print("Enter a number between 1 and 10: ");
            getInteger(1, 10);
            return 0;
        }
    }

    public static void factorial(long num)
    {
        Scanner scanner = new Scanner(System.in);
        boolean continueFactorial = false;
        String answer = "";


        do
        {
            if(num >= 1 && num <= 10)
            {
                long facNum = 0;
                long multiplyNums = 1;

                for(long x = num; x <= num; x++)
                {
                    System.out.printf("%d! = 1 ",num);

                    for(long y = 2; y <= num; y++)
                    {
                        System.out.printf("x %d ",y);
                        multiplyNums *= y;
                    }
                    System.out.printf("  = %d%n",multiplyNums);
                }
                System.out.print("Do you wish to continue y/n: ");
                answer = scanner.next();
                if(!answer.equals("y") && !answer.equals("n"))
                {
                    System.out.println("You did not make a valid entry, please try again!!");
                    System.out.print("Do you wish to continue y/n: ");
                    answer = scanner.next();
                }
                else if(answer.equals("y"))
                {
                    System.out.print("Please enter a number ranging from 1 to 10: ");

                    long numFact = scanner.nextLong();
                    factorial(numFact);
                }

            }
            else
            {

                System.out.printf("You entered %d, that number is not within the range, please try again!!!%n", num);
                System.out.print("Please enter a number ranging from 1 to 10: ");

                long numFact = scanner.nextLong();
                factorial(numFact);
            }

        }while(answer.equals("y"));
    }

    public static void rollDice()
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String wishToContinue = "";
        do
        {
            System.out.print("Enter the number of sides you wish the pair of dice to have: ");
            int diceNum = scanner.nextInt();

            int num1 = 1 + random.nextInt(diceNum);
            int num2 = 1 + random.nextInt(diceNum);

            System.out.println();

            System.out.printf("The first roll, you got %d%n",num1);
            System.out.printf("The scond roll, you got %d%n", num2);
            System.out.print("Do you wish to continue y/n? ");
            wishToContinue = scanner.next();

            if(!wishToContinue.equals("y") && !wishToContinue.equals("n"))
            {
                System.out.println("You entered an invalid entry, please try again!!!\n");

                System.out.print("Do you wish to continue y/n? ");
                wishToContinue = scanner.next();
            }

        }while(wishToContinue.equals("y"));

    }




}


