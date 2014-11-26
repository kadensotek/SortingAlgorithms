public class BubbleSort
{
    public static <T extends Comparable<T>> void sort(T[] array)
    {
        T temp;

        /* Cycles through N=array.length times to guarantee successful sort */
        /* Maybe implement boolean to check if swap was made in order to bail out in case of early finish */
        for(int i=0; i<array.length; i++)
        {
             for(int j=0; j<array.length-1; j++)
             {
                  /* Swaps elements if needed */
                  if(array[j].compareTo(array[j+1]) > 0)
                  {
                      temp = array[j];
                      array[j] = array[j+1];
                      array[j+1] = temp;
                  }
             }
        }
    }
}
