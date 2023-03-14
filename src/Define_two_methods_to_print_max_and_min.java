import java.util.Scanner;

public class Define_two_methods_to_print_max_and_min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int max = findmax(num1, num2, num3);
        int min = findmin(num1, num2, num3);

        System.out.println("The maximum number is : "  + max);
        System.out.println("The minimum number is : " + min);

    }
    static int findmax(int num1, int num2, int num3) {
        int max = num1;
        if(num1 < num2){
            max = num2;
        }
        if(num2< num3){
            max = num3;
        }
        return max;
    }
    static int findmin(int num1, int num2, int num3) {
        int min = num1;
        if(num1 > num2){
            min = num2;
        }
        if(num2 > num3){
            min = num3;
        }
        return min;
    }
}

