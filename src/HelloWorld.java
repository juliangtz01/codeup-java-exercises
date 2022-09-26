import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {

        //1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 10;
        //2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "San Benito";
        //5. Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        long myNumber;

        //6. Change your code to assign the value 3.14 to myNumber. What do you notice?
//        myNumber = 123;

        //9. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        double myNumber;
        myNumber = 3.14;

        System.out.println(myFavoriteNumber);
        System.out.println(myString);
        System.out.println(myNumber);
//        System.out.println("Hello, World!");
        System.out.println();

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        System.out.println();
//
//        System.out.println(++x);
//        System.out.println(x);

//        System.out.println();

        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";

        /*
        *13.  Rewrite the following expressions using the relevant shorthand assignment operators:
        * int x = 4;
        * x = x + 5;
        *
        * int x = 3;
        * int y = 4;
        * y = y * x;
        *
        * int x = 10;
        * int y = 2;
        * x = x / y;
        * y = y - x;
        * */
//        int x = 8;

        System.out.println();
//        System.out.println(++x);
//        int x = 3;
//        int y = 4;
//        y *= x;

//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

        System.out.println(x);
        System.out.println(y);

    }
}
