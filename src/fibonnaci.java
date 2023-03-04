import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the N : ");
        int n= input.nextInt(); int a=0; int b=1; int c;
        System.out.println(a); //prints 0
        System.out.println(b); //prints 1
        for(int i=2;i<n;i++) { //initializes from the second loop as it already printed first 2 nos
            c = a + b;        //0 +1 =1
            System.out.println(c); //1
            a = b;   // a=1
            b = c;  //b=1 ;so the next loop would be c=1+1=2;next will be c=2+1=3 and so on until n.
        }

    }
}
