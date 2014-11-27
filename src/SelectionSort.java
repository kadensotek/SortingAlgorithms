public class SelectionSort
{
    public static <T extends Comparable<T>> void sort(T[] array)
    {
        for(int i=0; i<array.length; i++)
        {
            T minVal = array[i];
            int minValIndex = i;

            for(int j=i+1; j<array.length; j++)
            {
               if(array[j].compareTo(minVal)<0)
               {
                   minVal = array[j];
                   minValIndex = j;
               }
            }

            T temp = array[i];
            array[i] = array[minValIndex];
            array[minValIndex] = temp; 
        }
    }
}
