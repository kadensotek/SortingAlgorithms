import java.util.List;

public class InsertionSort
{
    /* 
     *   Simple sort with complexity of O(n^2).
     *   Small overhead so useful with small arrays.
     *   Better than BubbleSort.
     */

    public static <T extends Comparable<T>> void sort(List<T> list)
    {
        /* Cycle through list, starting at second element */
        for(int i=1; i < list.size(); i++)
        {
            T value = list.get(i); /* Element that we're currently looking at */
            int j = i - 1;  /* first element we compare to */

            /* While value is smaller than our comparison elements, we move the
             * comparisons toward the end until our value is the larger in the comparison
             */
            while(j >= 0 && value.compareTo(list.get(j)) < 0)
            {
                list.set(j+1, list.get(j));
                j--;
            }
            list.set(j+1, value);  /* Insert our value into correct place */
        }        
    }
}
