import java.util.ArrayList;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        intro();
    }

    //create an intro function to display a welcome message to the user
    public static void intro()
    {
        System.out.println("Welcome to the Codeup Grocery List App!!!\n");
        createGroceryList();

    }

    //create a function to ask the user if they wish to create a grocery list
    public static void createGroceryList()
    {
        Scanner scanner = new Scanner(System.in);
        String continueAddingGroceries = "";

        do
        {
            System.out.println("Would you like to create a grocery list? ");
            System.out.println();
            groceryCategory();

        }while(continueAddingGroceries.equalsIgnoreCase("y"));
    }

    public static void groceryCategory()
    {
        ArrayList <String> category = new ArrayList<>();
        category.add("Baby Items");
        category.add("Bread/Bakery");
        category.add("Bakery");
        category.add("Canned/Jarred Goods");
        category.add("Dairy");
        category.add("Dry/Baking Goods");
        category.add("Frozen Foods");
        category.add("Meat");
        category.add("Produce");
        category.add("Cleaners");
        category.add("Paper Goods");
        category.add("Personal Care");
        category.add("Pet Items");
        category.add("School Supplies");
        category.add("Crafts");
        category.add("Outdoors/Camping");
        category.add("Pest Control");
        category.add("Others");

        int count = 1;

        for(int x = 0; x < category.size(); x++)
        {
            Collections.sort(category);
            System.out.printf("%d. %s%n", count, category.get(x));
            count++;
        }
    }

}
