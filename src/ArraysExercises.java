import java.util.Arrays;

public class ArraysExercises
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[3]);

        String[] Person = new String[3];
        Person[0] = "Bob";
        Person[1] = "John";
        Person[2] = "Stan";

        for(String person: Person)
        {
            System.out.println(person);
        }
    }
}
