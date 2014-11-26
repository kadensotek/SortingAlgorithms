import java.util.InputMismatchException;
import java.util.Scanner;

public class SortDriver
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the sorting algorithm demonstration.");
        mainLoop();
        System.out.println("Goodbye!");
    }

    public static void mainLoop()
    {
        Integer[] array;
        int choice = 9;
        boolean quit = false;

        while(!quit)
        {
            array = new Integer[]{5, 3, 8, 1, 0, 2, 9, 7, 4, 6};  /* resets array */
            printMenu();

            choice = getChoice();
            System.out.println();

            switch (choice)
            {
                case 1:
                    System.out.printf("Bubble Sort results\n####################\n");
                    printArray("Original array: ", array);
                    BubbleSort.sort(array); 
                    printArray("Sorted array:   ", array);
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.printf("Error: Not a valid option.  Please choose again.\n\n");
                    break;
            }
            System.out.println();
        }
    }

    public static <T> void printArray(String message, T[] array)
    {
        System.out.println(message + java.util.Arrays.toString(array));
    }

    public static void printMenu()
    {
        System.out.println("Select the type of sort:");
        System.out.println("1. Bubble Sort");
        System.out.println("0. Quit");
        System.out.printf("Make your selection:  ");
    }

    public static int getChoice()
    /* gets user input for choice in form of integer; returns 9 if input mismatch */
    {
        Scanner myscanner = new Scanner(System.in);
        int choice = 9;
        try
        {
            choice = myscanner.nextInt();
        }
        catch(InputMismatchException ex)
        {
            choice = 9;
        }
        return choice;
    }
}
