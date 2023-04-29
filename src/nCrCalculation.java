import java.util.Scanner;

public class nCrCalculation {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //nCr = n! / (r! * (n-r)!)
        int n = in.nextInt();
        int r = in.nextInt();

        int ncr = fact(n)/ (fact(r) * fact(n-r));
        System.out.println(ncr);

    }
    static int fact(int n) {
        int result = 1;
        for(int i = 1 ; i <= n; i++){
            result = result * i;
        }
        return result;

    }
}
