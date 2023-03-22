import java.util.Scanner;

public class Pythogorian_triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        triplet(a , b, c);
    }

    static void triplet(int a, int b, int c) {
        int a1 = a*a;
        int b1 = b*b;
        int c1 = c*c;
        if(a1 + b1 == c1){
            System.out.println("It is a Pytho triplet ");
        } else System.out.println("Not a pytho triplet");
    }
}
