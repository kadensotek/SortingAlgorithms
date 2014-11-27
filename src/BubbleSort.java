public class BubbleSort
{
    /*
     *     Simple sort with complexity of O(n^2).
     *     Not useful outside of small arrays.
     */

    public static <T extends Comparable<T>> void sort(T[] array)
    {
        T temp;
        boolean hasChanged;

        /*  Cycles through N=array.length times to guarantee successful sort.
         *  Ends if a cycle results in no changes. 
         */
        for(int i=0; i<array.length; i++)
        {
             hasChanged = false;
             for(int j=0; j<array.length-1; j++)
             {
                  /* Swaps elements if needed */
                  if(array[j].compareTo(array[j+1]) > 0)
                  {
                      hasChanged = true;
                      temp = array[j];
                      array[j] = array[j+1];
                      array[j+1] = temp;
                  }
             }
             if(hasChanged==false)  break;
        }
    }
}
