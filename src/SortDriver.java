import java.util.InputMismatchException;
import java.util.Arrays;
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
        Integer[] intArray;
        String[] strArray;
        int choice = 9;
        boolean quit = false;

        while(!quit)
        {
            intArray = new Integer[]{5, 3, 8, 1, 0, 2, 9, 7, 4, 6};  /* resets array */
            strArray = new String[]{"c", "w", "x", "n", "a", "u", "t", "p", "m", "l"};  /* resets array */
            printMenu();

            choice = getChoice();

            switch (choice)
            {
                case 1:
                    System.out.printf("Bubble Sort results\n####################\n");
                    processArray(intArray, choice);
                    processArray(strArray, choice);
                    break;
                case 2:
                    System.out.printf("Insertion Sort results\n#######################\n");
                    processArray(intArray, choice);
                    processArray(strArray, choice);
                    break;
                case 3:
                    System.out.printf("Selection Sort results\n#######################\n");
                    processArray(intArray, choice);
                    processArray(strArray, choice);
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

    /* Takes array and calls printArray before and after calling the appropriate sort function */
    public static <T extends Comparable<T>> void processArray(T[] array, int choice)
    {
        printArray("Original array: ", array);
        switch(choice)
        {
            case 1:
                BubbleSort.sort(array);
                break;
            case 2:
                InsertionSort.sort(array);
                break;
            case 3:
                SelectionSort.sort(array);
                break;
            default: ; // Will never be default
        }
        printArray("Sorted array:   ", array);
    }

    public static <T> void printArray(String message, T[] array)
    {
        System.out.println(message + Arrays.toString(array));
    }

    public static void printMenu()
    {
        System.out.println("Select the type of sort:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Selection Sort");
        System.out.println("0. Quit");
        System.out.printf("Make your selection:  ");
    }

    /* gets user input for choice in form of integer; returns 9 if input mismatch */
    public static int getChoice()
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
        System.out.println();
        return choice;
    }
}
