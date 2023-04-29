import java.util.Scanner;
public class FactOfMiddleElement {
    public static void main(String[] args){
        //Scanner in = new Scanner(System.in);

        int ans = factofmid(12345);
        System.out.println(ans);
    }

     static int factofmid(int num) {

         String numStr = Integer.toString(num);
        int midIndex = numStr.length()/2;
         int midnum = Character.getNumericValue(numStr.charAt(midIndex));
         //System.out.println(midnum);
         int result = 1;
         for(int i = 1; i <= midnum; i++) {
             result = result * i;
         }
         return result;
     }

}
