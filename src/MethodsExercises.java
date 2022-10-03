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




}


