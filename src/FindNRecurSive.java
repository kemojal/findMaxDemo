/**
 * Created by kemo jallow on 3/31/2016.
 */
public class FindNRecurSive {
    public static int findN(long N)
    {
        int sum  =0;
        int n    = ( int) (-1 + Math.sqrt(1 + 8 * Math.sqrt(N))) / 2;
        long numerator = (long) Math.pow(2*n +1 , 2);
        int denominator = 8;
        if( Math.pow(numerator/ denominator , 2) == N && N <= Long.MAX_VALUE){
            return  n;
        }else
        {
            return  -1;
        }
    }
}
