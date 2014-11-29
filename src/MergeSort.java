public class MergeSort
{
    /*
     *     Divide and conquer sort with complexity of O(n log n).
     *     Uses recursive calls to sort array
     *     Repeatedly divides array in half until every group has one or no elements
     *     Then recombines in order to finish the sort
     */

    public static <T extends Comparable<T>> void sort(T[] array)
    {
        int low = 0;
        int high = array.length-1;
        mergesort(array, low, high);
    }

    public static <T extends Comparable<T>> void mergesort(T[] array, int low, int high)
    {
        T temp;
        int middle;
        int left;
        int right;

        if(low < high)
        {
            /* Splits array in half and makes recursive call on each half */
            middle = low + ((high - low) / 2);
            mergesort(array, low, middle);
            mergesort(array, middle + 1, high);

            /* Merge arrays */
            left = low;
            right = middle + 1;

            /* While the array is still unsorted */
            while(left <= middle &&  right <= high)
            {
                /* if current left element is greater than current right element, they need to be moved */
                if(array[left].compareTo(array[right]) > 0)
                {
                    temp = array[right];

                    /* Move everything in left array one space to the right to make room */
                    for(int i=right-1; i>=left; i--)
                    {
                        array[i+1] = array[i]; 
                    } 
                    array[left] = temp;

                    /* right and middle shifted right to keep sides balanced */
                    middle++;
                    right++;
                } 
                /* Left always moves one space right */
                left++;
            }
        }
    }
}

