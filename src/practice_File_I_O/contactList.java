package practice_File_I_O;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class contactList
{
    public static void main(String[] args)
    {
        try
        {
            Scanner scanner = new Scanner(System.in);
//            File file = new File("src/practice_File_I_O/contacts.txt");

            BufferedReader br = new BufferedReader(new FileReader("src/practice_File_I_O/contacts.txt"));


            System.out.println("1. View Contacts.\n2. Add a new contact.\n3. Search a contact by name.\n4. Delete an existing contact.\n5. Exit");
            System.out.print("Enter an option (1, 2, 3, 4, or 5): ");
            int userInput = scanner.nextInt();

            switch (userInput)
            {
                case 1:
                    System.out.println();
                    BufferedReader fileReader = new BufferedReader(new FileReader("src/practice_File_I_O/contacts.txt"));

                    String lineTxt = fileReader.readLine();

                    if(lineTxt == null)
                    {
                        System.out.println("Contact list is empty");
                    }
                    else
                    {
                        while(lineTxt != null)
                        {
                            System.out.println(lineTxt);
                            lineTxt = fileReader.readLine();
                        }
                    }
                    fileReader.close();
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Enter a new contact");
                    System.out.print("Enter the new contact's name: ");
                    String name = scanner.nextLine();
                    System.out.print("\nEnter the new contact's phone number: ");
                    String phoneNumber = scanner.next();
                    String contact = "\n" + name + "  " + phoneNumber;
                    FileWriter fw = new FileWriter("src/practice_File_I_O/contacts.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(contact);
                    bw.close();

                    break;
                case 3:
                    scanner.nextLine();
                    String input;
                    int length = 0;
                    System.out.print("Enter the name of the contact you want to search for: ");
                    String searchName = scanner.nextLine();
                    BufferedReader nameSearch = new BufferedReader(new FileReader("src/practice_File_I_O/contacts.txt"));
                    input = nameSearch.readLine();
                    length = input.length();
//                    String[][] arr = {input.split("|",1)};
//                    String[] arr = new String[input.length() - 1];
                    System.out.println(input.length());

                    int count = 0;
                    while(input != null)
                    {
                        input = nameSearch.readLine();
//                        test[count] = String.valueOf(input.split("|",1));
                        count++;
                    }

                    String[] test = new String[4];

                    System.out.println(count);

                    int count2 = 0;

                    BufferedReader search = new BufferedReader(new FileReader("src/practice_File_I_O/contacts.txt"));
                    String input2 = search.readLine();

                    while(input2 != null)
                    {
                        test[count2] = Arrays.toString(input2.split("|", 1));
                        input2 = search.readLine();
                        count2++;
                    }

                    count2 = 0;


//                    for(int x = 0; x < test.length; x++)
//                    {
//                        System.out.println(Arrays.deepToString(test));
//                    }

                    String n = "";

                    for(String a : test)
                    {
                        if(a.contains(searchName))
                        {
//                            System.out.println(a);
                            n = Arrays.toString(a.split("|", 1));
                            break;
                        }
                        else
                        {
                            n = "Contact " + searchName + " is not in the contact list!";
                        }
                    }
                    System.out.println(n);
                    nameSearch.close();
                    search.close();
                    break;
                default:
            }

            br.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File does not exits");
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println("An error accord.");
            e.printStackTrace();
        }


    }
}
