public class SelectionSort
{
    /*
     *     Simple sort with complexity of O(n^2).
     *     Small overhead so useful with small arrays.
     *     Smallest amount of data movement of all sorts 
     */

    public static <T extends Comparable<T>> void sort(T[] array)
    {
        for(int i=0; i<array.length-1; i++)
        {
            T minVal = array[i];
            int minValIndex = i;

            /* Pass through rest of array and see if element is smaller than current min */
            for(int j=i+1; j<array.length; j++)
            {
               if(array[j].compareTo(minVal)<0)
               {
                   minVal = array[j];
                   minValIndex = j;
               }
            }

            /* Swap elements */
            T temp = array[i];
            array[i] = array[minValIndex];
            array[minValIndex] = temp; 
        }
    }
}
