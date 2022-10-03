import java.util.Scanner;

public class MethodPractice
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter two numbers to multiply");
        System.out.print("Please enter the first number: ");
        double num1 = scanner.nextFloat();
        System.out.print("Please enter the second number: ");
        double num2 = scanner.nextFloat();
        System.out.println(multiply(num1, num2));
    }

    //Make a function that takes in two arguments of type double
    //and multiply the two arguments. Make your method return the value as a double
    //Name this method "multiply".

    public static double multiply(double num1, double num2)
    {
        return num1 * num2;
    }
}
