import java.util.List;

public class SelectionSort
{
    /*
     *   Simple sort with complexity of O(n^2).
     *   Small overhead so useful with small arrays.
     *   Smallest amountof data movement of all sorts.
     */

    public static <T extends Comparable<T>> void sort(List<T> list)
    {
        /* Iterate through list, swapping min value in remaining list with
         * current value in this loop
         */
        for(int i=0; i<list.size()-1; i++)
        {
            T minVal = list.get(i);
            int minValIndex = i;

            /* Finding smallest element in list */
            for(int j=i+1; j<list.size(); j++)
            {
               /* Updates smallest element if one is found */
               if(list.get(j).compareTo(minVal) < 0)
               {
                   minVal = list.get(j);
                   minValIndex = j;
               } 
            }
            swap(list, i, minValIndex);
        } 
    }

    public static <T> void swap(List<T> list, int firstPos, int secondPos)
    {
        T temp = list.get(firstPos);
        list.set(firstPos, list.get(secondPos));
        list.set(secondPos, temp); 
    }
}
