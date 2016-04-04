/**
 * Created by kemo jallow on 4/4/2016.
 */
public class Kite
{
    public static void kite()
    {
        for (int i = 1; i < 10; i += 2) {
            for (int j = 0; j < 9 - i / 2; j++)
                System.out.print("# ");

            for (int j = 0; j < i; j++)
               System.out.print("*");

            System.out.print("\n");
        }

        /*for (int i = 7; i > 0; i -= 2) {
            for (int j = 0; j < 9 - i / 2; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.print("\n");
        }
    */

    }
}
