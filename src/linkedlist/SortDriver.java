import java.util.InputMismatchException;
import java.util.List;
import java.util.LinkedList;
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
        List<Integer> intList;
        List<String> strList;
        int choice = 9;
        boolean quit = false;

        while(!quit)
        {
            intList = initializeIntList();
            strList = initializeStrList();
            printMenu();

            choice = getChoice();

            switch (choice)
            {
                case 1:
                    System.out.printf("Bubble Sort results\n####################\n");
                    processList(intList, choice);
                    processList(strList, choice);
                    break;
                case 2:
                    System.out.printf("Insertion Sort results\n#######################\n");
                    processList(intList, choice);
                    processList(strList, choice);
                    break;
                case 3:
                    System.out.printf("Selection Sort results\n#######################\n");
                    processList(intList, choice);
                    processList(strList, choice);
                    break;
                case 4:
                    System.out.printf("Quick Sort results\n###################\n");
                    processList(intList, choice);
                    processList(strList, choice);
                    break;
                case 5:
                    System.out.printf("Merge Sort results\n###################\n");
                    processList(intList, choice);
                    processList(strList, choice);
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

    /* Takes list and calls printList before and after calling the appropriate sort function */
    public static <T extends Comparable<T>> void processList(List<T> list, int choice)
    {
        printList("Original list: ", list);
        switch(choice)
        {
            case 1:
                //BubbleSort.sort(list);
                break;
            case 2:
                //InsertionSort.sort(list);
                break;
            case 3:
                //SelectionSort.sort(list);
                break;
            case 4:
                //QuickSort.sort(list);
                break;
            case 5:
                //MergeSort.sort(list);
                break;
            default: ; // Will never be default
        }
        printList("Sorted list:   ", list);
    }

    public static List<Integer> initializeIntList()
    {
        List<Integer> intList = new LinkedList<Integer>();
        intList.add(5);
        intList.add(3);
        intList.add(8);
        intList.add(1);
        intList.add(0);
        intList.add(2);
        intList.add(9);
        intList.add(7);
        intList.add(4);
        intList.add(6);
        return intList; 
    }

    public static List<String> initializeStrList()
    {
        List<String> strList = new LinkedList<String>();
        strList.add("c");
        strList.add("w");
        strList.add("x");
        strList.add("n");
        strList.add("a");
        strList.add("u");
        strList.add("t");
        strList.add("p");
        strList.add("m");
        strList.add("l");
        return strList; 
    }

    public static <T> void printList(String message, List<T> list)
    {
        System.out.println(message + list.toString());
    }

    public static void printMenu()
    {
        System.out.println("Select the type of sort:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Selection Sort");
        System.out.println("4. Quick Sort");
        System.out.println("5. Merge Sort");
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
