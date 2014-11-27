public class QuickSort
{
    /*
     *     Divide and conquer sort with complexity of O(n log n).
     *     Uses recursive calls to sort array
     *     Considered the fastest sorting algorithm.
     */

    public static <T extends Comparable<T>> void sort(T[] array)
    {
        quicksort(array, 0, array.length-1);
    }

    public static <T extends Comparable<T>> T[] quicksort(T[] array, int low, int high)
    {
        if(array==null || array.length==0)  return;  /* base case */
        if(low >= high) return;

        /* get pivot */

        /* arrange so left<pivot<right */

        /* make recursive calls on left and right sides
    }
}
