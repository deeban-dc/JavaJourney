import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number for Factorial : ");
        int num = input.nextInt();
        long result = 1;

        for(int i = 1; i <= num; i++){
            result = result * i;
        }
        System.out.println(result);
    }
}
