import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

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
        HashMap <Grocery, String> groceryList = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> category = new ArrayList<>();
        category.add("Baby Items");
        category.add("Bread/Bakery");
        category.add("Beverages");
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

        String answer = "";

        do
        {
            int count = 1;
            for(int x = 0; x < category.size(); x++)
            {

                Collections.sort(category);
                System.out.printf("%d. %s%n", count, category.get(x));
                count++;
            }

            System.out.print("\nPlease select a category by selecting the number associated with the category: ");
            int selection = scanner.nextInt();

            scanner.nextLine();

            System.out.print("\nPlease enter the name of the item: ");
            String name = scanner.nextLine();

            System.out.printf("%nPlease enter the quantity for %s: ", name);
            int qty = scanner.nextInt();
            Grocery item = new Grocery(name, qty);

            groceryList.put(item, category.get(selection - 1));
            System.out.println("\nIf you would like to add more items to the list please enter add, if you wish to finalize the list please enter final: ");
            answer = scanner.next();

        }while(answer.equalsIgnoreCase("add"));

        System.out.println("\nBelow is your grocery list:\n");

        //Creating a list of the original hashmap in order to sort
        //the elements with sort() method
        List<Map.Entry<Grocery, String>> sortedGroceryList = new ArrayList<>(groceryList.entrySet());

        //Using Entry's comparingByValue() method for sorting in ascending order
        sortedGroceryList.sort(Map.Entry.comparingByValue());

        for(Entry <Grocery, String> entry : sortedGroceryList)
        {
            System.out.printf("%s - %s - quantity: %d%n", entry.getValue(), entry.getKey().getItem(), entry.getKey().getQuantity());
        }
    }

}
