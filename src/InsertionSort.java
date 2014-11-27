public class InsertionSort
{
    /*
     *     Simple sort with complexity of O(n^2).
     *     Small overhead so useful with small arrays.
     *     Better than BubbleSort
     */

    public static <T extends Comparable<T>> void sort(T[] array)
    {
        /* Cycle through array */
        for(int i=1; i<array.length; i++)
        {
            T value = array[i];  /* Element that we're looking at */
            int j = i - 1;       /* First element that we compare to */

            /*   Move backward through array, making comparisons and
             *   moving elements toward the end until comparison elements
             *   are no longer larger than our value 
             */
            while(j>=0 && array[j].compareTo(value)>0)
            {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = value;  /* Insert our value back into the array in correct place */
        }
    }
}
