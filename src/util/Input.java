package util;
import java.util.Scanner;

public class Input
{
    private Scanner scanner;

    public Input()
    {
        scanner = new Scanner(System.in);
    }

    public String getString()
    {
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
            System.out.printf("Please enter a number that is between %d and %d: ", min, max);
            num = scanner.nextInt();

            if(num >= min && num <= max)
            {
                shouldContinue = false;
            }

        }while(shouldContinue == true);

        return num;
    }

    public int getInt()
    {
        return scanner.nextInt();
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
        return scanner.nextFloat();
    }

    public static void main(String[] args)
    {
        int min = 0, max = 0;
        Input test = new Input();
        System.out.print("Please enter a number: ");
        System.out.print(test.getInt());
        System.out.println();
        System.out.print("Please enter y or n: ");
        System.out.print(test.yesNo());
        System.out.println();
        test.scanner.nextLine();
        System.out.print("Please type what ever comes to mind: ");
        System.out.printf("You typed, %s.%n",test.getString());
        System.out.println();
        System.out.println("In the next line you will be asked to enter a set of numbers used to set a range!");
        System.out.print("please enter the minimum range: ");



    }

}
