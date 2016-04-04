/**
 * Created by kemo jallow on 4/2/2016.
 */
public class findMinArry {
    public static int findMind(final int [] arr, final String toReturn)
    {
        int min  = arr[0];
        int index = 0;
        for( int i = 0; i  < arr.length; i++)
        {
            if( min > arr[i])
            {
                min = arr[i];
                index = i;
            }
        }
        if( toReturn == "index")
        {
            return  index;
        }else
        {
            return min;
        }
    }
}
