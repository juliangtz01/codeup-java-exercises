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




}


