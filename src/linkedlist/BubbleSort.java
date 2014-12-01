import java.util.List;

public class BubbleSort
{
    /*
     * Simple sort with complexity of O(n^2).
     * Not useful outside of small arrays.
     */

    public static <T extends Comparable<T>> void sort(List<T> list)
    {
        T first;
        T second;
        boolean hasChanged;

       /* Cycles through N=array.length times to guarantee successful sort.
        * Ends if a cycle results in no changes.
        */
        for(int i=0; i<list.size()-1; i++)
        {
            hasChanged = false;
            for(int j=0; j<list.size()-1; j++)
            {
                /* Two elements currently being compared */
                first = list.get(j);
                second = list.get(j+1);

                /* swap elements if necessary */
                if(first.compareTo(second) > 0)
                {
                    swap(list, j, j+1); 
                    hasChanged = true;
                }
            }
            if(!hasChanged)
            {
                break;
            }
        }	
    }

    private static <T> void swap(List<T> list, int firstPos, int secondPos)
    {
        T temp = list.get(firstPos);
        list.set(firstPos, list.get(secondPos));
        list.set(secondPos, temp);
    }
}
