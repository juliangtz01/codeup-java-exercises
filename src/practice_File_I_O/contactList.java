package practice_File_I_O;

import java.io.*;
import java.util.Scanner;

public class contactList
{
    public static void main(String[] args)
    {
        try
        {
            Scanner scanner = new Scanner(System.in);
            File file = new File("src/practice_File_I_O/contacts.txt");
            if(file.createNewFile())
            {
                System.out.printf("File created: %s",file.getName());
            }
            else
            {
                System.out.println("File already exists!");
            }

            FileWriter myWriter = new FileWriter(file.getName());

            BufferedWriter writer = new BufferedWriter(myWriter);

            FileReader myReader = new FileReader(file.getName());

            BufferedReader br = new BufferedReader(myReader);


            System.out.println("1. View Contacts.\n2. Add a new contact.\n3. Search a contact by name.\n4. Delete an existing contact.\n5. Exit");
            System.out.print("Enter an option (1, 2, 3, 4, or 5): ");
            int userInput = scanner.nextInt();

            switch (userInput)
            {
                case 1:
                    if(!br.ready())
                    {
                        System.out.println("Your text file is empty!");
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Enter a new contact");
                    System.out.print("Enter the new contact's name: ");
                    String name = scanner.nextLine();
                    System.out.print("\nEnter the new contact's phone number: ");
                    String phoneNumber = scanner.next();
                    writer.write(name + "  " + phoneNumber);
                    break;
                case 3:
                    System.out.print("Enter the name of the contact you want to search for: ");
                    String searchName = scanner.nextLine();
                    while(br.readLine() != null)
                    {
                        System.out.println(br);
                    }
                    break;
                default:
            }




            myReader.close();
            myWriter.close();
            br.close();
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("An error accord.");
            e.printStackTrace();
        }


    }
}
