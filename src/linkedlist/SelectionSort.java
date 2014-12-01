public class SelectionSort
{
    /*
     *   Simple sort with complexity of O(n^2).
     *   Small overhead so useful with small arrays.
     *   Smallest amountof data movement of all sorts.
     */

    public static <T extends Comparable<T>> void sort(List<T> list)
    {

    }

    public static <T> void swap(List<T> list, int firstPos, int secondPos)
    {
        T temp = list.get(firstPos);
        list.set(firstPos, list.get(secondPos));
        list.set(secondPos, temp); 
    }
}
