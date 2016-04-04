import javafx.scene.shape.Circle;

import java.awt.*;


/**
 * Created by kemo jallow on 3/31/2016.
 */
public class FindMaxDemo {
    /*
    * Return max item in arr
    * Precondition: arr.length >0
     */
    public static Comparable findMax(Comparable[] arr) {
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[maxIndex]) > 0) {
                maxIndex = i;
            }
        }

        return arr[maxIndex];
    }

/*
* Test findmax on shape and string objects.
 */

    public static  void main(String[] args)
    {
        //Shape [] sh1  ={ new Circle(2.0),
              //  new Square(3.0),
               // new Rectangle(3.0,4.0 )};
        int [] nums  = {2,4,5,8,3,4};
        String [] st1 = {"Joe", "Bob", "Bill", "zeke"};
        //System.out.print(findMax(st1));
        /*
        String s = null;
        Odering myOders = new Odering();
        System.out.print(myOders.orderWord(s));
        */
        /*
        RecursiveSum myRec  = new RecursiveSum();
        System.out.println("my answers: " + myRec.factorial(3568));
        */

        //FindNRecurSive myN = new FindNRecurSive();
        //System.out.println(myN.findN(1931923335038602501L));
       // System.out.println("The maximun length of the long is " + Long.MAX_VALUE);

        //findMinArry myVal  = new findMinArry();
       // System.out.println("the minimum value is " + myVal.findMind(new int[]{1,2,3,4,5}, "index"));

       // CalculatePI myPI = new CalculatePI();
       // System.out.println(" PI is estimated as: " + myPI.estimatePi());

        Kite myKite = new Kite();
        myKite.kite();
    }


}