package util;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input
{
    private Scanner scanner;

    public Input()
    {
        scanner = new Scanner(System.in);
    }

    public String getString(String input)
    {
        System.out.print(input);
        return scanner.nextLine();
    }

    public boolean yesNo()
    {
        boolean answer = false;
        if(scanner.next().equalsIgnoreCase("y") || scanner.next().equalsIgnoreCase("yes"))
            answer = true;
//        else if(scanner.next().equalsIgnoreCase("n") || scanner.next().equalsIgnoreCase("no"))
//            answer = false;

        return answer;

    }

    public int getInt(int min, int max)
    {
        int num = 0;
        boolean shouldContinue = true;

        do
        {
            try
            {
                System.out.printf("Please enter a number that is between %d and %d: ", min, max);
                num = scanner.nextInt();

                if(num >= min && num <= max)
                {
                    shouldContinue = false;
                }

            }
            catch(InputMismatchException | NumberFormatException e)
            {
                System.out.println("Sorry but you did not enter an integer!!");
                e.getMessage();
            }


        }while(shouldContinue == true);

        return num;
    }

    public int getInt()
    {
            try
            {
                return Integer.parseInt(getString("Please enter a number: "));
            }
            catch(Exception e)
            {
                System.out.println("Sorry but that is not a number, please try again!!!");
                return getInt();
            }
    }

    public double getDouble(double min, double max)
    {
        double num = 0.0;
        boolean shouldContinue = true;

        do
        {
            System.out.printf("Please enter a number that is between %d and %d: ", min, max);
            num = scanner.nextFloat();

            if(num >= min && num <= max)
            {
                shouldContinue = false;
            }

        }while(shouldContinue == true);

        return num;
    }

    public double getDouble()
    {
        try
        {
            return Double.parseDouble(getString("Please enter a numeric decimal: "));
        }
        catch (NumberFormatException e)
        {
            System.out.println("Sorry but the input you entered is not numeric decimal, please try again!!!");
            return getDouble();
        }
    }

    public static void main(String[] args)
    {
        int min = 0, max = 0;
        Input test = new Input();
        System.out.println(test.getInt());
        System.out.println(test.getDouble());
//        System.out.println();
//        System.out.print("Please enter y or n: ");
//        System.out.print(test.yesNo());
//        System.out.println();
//        test.scanner.nextLine();
//        System.out.print("Please type what ever comes to mind: ");
//        System.out.printf("You typed, %s.%n",test.getString());
//        System.out.println();
//        System.out.println("In the next line you will be asked to enter a set of numbers used to set a range!");
//        System.out.print("please enter the minimum range: ");



    }

}
