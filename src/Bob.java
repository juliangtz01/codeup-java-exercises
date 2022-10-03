import java.util.Scanner;

public class Bob
{
    public static void main(String[] args)
    {
        converseWithBob();
    }

    public static void converseWithBob()
    {
        String wishToContinue = "";
        String sentence = "";

        do
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Talk with Bob: ");
            sentence = scanner.nextLine();
            System.out.println(sentence.length());

            int length = sentence.length() - 1;



            if(sentence.charAt(length) == '?')
            {
                System.out.println("Sure.\n");
            }
            else if(sentence.charAt(length) == '!')
            {
                System.out.println("Whoa, chill out!\n");
            }
            else if(sentence.isEmpty())
            {
                System.out.println("Fine. Be that way!\n");
            }
            else
            {
                System.out.println("Whatever.\n");
            }

            System.out.print("Do you wish to continue talking with Bob, y/n? ");
            wishToContinue = scanner.next();

            if(!wishToContinue.equals("y") && !wishToContinue.equals("n"))
            {
                System.out.println("Sorry but that is an invalid entry, please try again!");

                System.out.print("Do you wish to continue talking with Bob, y/n? ");
                wishToContinue = scanner.next();
            }

        }while(wishToContinue.equals("y"));
    }

}
