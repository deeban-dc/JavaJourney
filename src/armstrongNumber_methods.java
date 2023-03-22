import java.util.Scanner;

public class armstrongNumber_methods {
    static boolean IsArmstrongNumber(int num){
        int numcopy = num;
        int arm =0 ;
        while(num !=0){
            int rem = num % 10;
            arm = arm + (rem * rem * rem);
            num = num / 10;
    }
        return (arm == numcopy);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(IsArmstrongNumber(num)){
            System.out.println("It is a Armstrong Number.");
        }
        else System.out.println("Not a Armstrong Number");
    }


}


