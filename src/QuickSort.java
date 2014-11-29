public class QuickSort
{
    /*
     *     Divide and conquer sort with complexity of O(n log n).
     *     Has worst case complexity of O(n^2).
     *     Uses recursive calls to sort array
     *     Considered the fastest sorting algorithm.
     */

    public static <T extends Comparable<T>> void sort(T[] array)
    {
        quicksort(array, 0, array.length-1);
    }

    public static <T extends Comparable<T>> void quicksort(T[] array, int low, int high)
    {
        if(array==null || array.length==0)  return;  /* base case */
        if(low >= high) return;

        /* get pivot point */
        int middle = low + ((high - low) / 2);
        T pivot = array[middle];

        /* Set end pointers for loops */
        int i = low;
        int j = high;

        while(i < j)
        {
            /* moves low pointer forward until out of place element is found */
            while(array[i].compareTo(pivot) < 0)
            {
                i++;
            }

            /* moves high pointer back until out of place element is found */
            while(array[j].compareTo(pivot) > 0)
            {
                j--;
            }

            /* Swaps the elements and moves pointers */
            if(i <= j)
            {
                T temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
                j--;
            }
        }

        /* make recursive calls on left and right sides */
        if(low < j)
        {
            quicksort(array, low, j);
        }
 
        if(high > i)
        {
            quicksort(array, i, high);
        }   
    }
}
