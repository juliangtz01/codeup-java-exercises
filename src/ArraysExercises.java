import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises
{
    public static void main(String[] args)
    {
        Person[] person = new Person[3];
        person[0] = new Person("Bob");
        person[1] = new Person("John");
        person[2] = new Person("Stan");

        for(Person p : person)
        {
            System.out.println(p.getName());
        }

        Person p = new Person("Julian");

        System.out.println(Arrays.toString(addPerson(person, p)));

    }

    public static String[] addPerson(Person[] person, Person p)
    {
        int length = person.length + 1;

        String[] temp = new String[length];

        for(int x = 0; x < person.length; x++)
        {
            temp[x] = person[x].getName();
        }

        temp[length-1] = p.getName();

        return temp;
    }
}
