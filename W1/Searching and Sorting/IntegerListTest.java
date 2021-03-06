// ****************************************************************
// IntegerListTest.java
//
// Provide a menu-driven tester for the IntegerList class.
//
// ****************************************************************
import java.util.Scanner;
public class IntegerListTest
{
    static IntegerList list = new IntegerList(10);
    static Scanner scan = new Scanner(System.in);
    //-------------------------------------------------------
    // Create a list, then repeatedly print the menu and do what the
    // user asks until they quit
    //-------------------------------------------------------
    public static void main(String[] args)
    {
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0)
        {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
    }
    //-------------------------------------------------------
    // Do what the menu item calls for
    //-------------------------------------------------------
    public static void dispatch(int choice)
    {
        int loc;
        switch(choice)
        {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                System.out.println("How big should the list be?");
                int size = scan.nextInt();
                list = new IntegerList(size);
                list.randomize();
                break;
            case 2:
                list.selectionSort();
                break;
            case 3:
                System.out.print("Enter the value to look for: ");
                loc = list.search(scan.nextInt());
                if (loc != -1)
                System.out.println("Found at location " + loc);
                else
                System.out.println("Not in list");
                break;
            case 4:
                list.print();
                break;
             case 5:
                System.out.println("replace First");
                System.out.println("old val");
                int old = scan.nextInt();
                System.out.println("new val");
                int nval = scan.nextInt();
                 
                list.replaceFirst(old, nval);
                break;
            case 6 :
                System.out.println("replace all");
                System.out.println("old val");
                old = scan.nextInt();
                System.out.println("new val");
                nval = scan.nextInt();

                list.replaceAll(old, nval);
                break;
            case 7 :
                System.out.println("sort Decreasing");
                list.sortDecreasing();
                break;
            case 8 :
                System.out.println("binary search");
                System.out.print("Enter the value to look for: ");
                loc = list.binarySearchD(scan.nextInt());
                if (loc != -1)
                System.out.println("Found at location " + loc);
                else
                System.out.println("Not in list");
                break;
            default:
            System.out.println("Sorry, invalid choice");
        }
    }
    //-------------------------------------------------------
    // Print the user's choices
    //-------------------------------------------------------
    public static void printMenu()
    {
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Create a new list (** do this first!! **)");
        System.out.println("2: Sort the list using selection sort");
        System.out.println("3: Find an element in the list using linear search");
        System.out.println("4: Print the list");
        System.out.println("5: replace First");
        System.out.println("6: replace All");
        System.out.println("7: sort decrease");
        System.out.println("8: binary sort");
        System.out.print("\nEnter your choice: ");
    }
}