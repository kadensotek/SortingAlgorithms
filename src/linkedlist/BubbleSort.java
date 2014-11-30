import java.util.List;
import java.util.LinkedList;

public class BubbleSort
{
    public static <T extends Comparable<T>> void sort(List<T> list)
    {
        T first;
        T second;
        boolean hasChanged;

        for(int i=0; i<list.size()-1; i++)
        {
            hasChanged = false;
            for(int j=0; j<list.size()-1; j++)
            {
                first = list.get(j);
                second = list.get(j+1);

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