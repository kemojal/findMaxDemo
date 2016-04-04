/**
 * Created by kemo jallow on 3/31/2016.
 */
public class RecursiveSum {
    public static int factorial(long N) {
        if (N == 1.0) return 1;
        return (int) (Math.pow(N, 3.0) + factorial(N-1));
    }
}
