/**
 * Created by kemo jallow on 3/31/2016.
 */
public class Odering {
        public String orderWord(String s)
        {
            if( s == null)
            {
                return "Invalid String!";
            }else
            //your great code here:
            if( s.isEmpty())
            {
               return "Invalid String!";
            }
            else
            {
                char[] c = s.toCharArray();        //Convert to array of chars
                java.util.Arrays.sort(c);          //Sort
                String newString = new String(c);  //Convert back to String
                return newString;
            }
        }
}
