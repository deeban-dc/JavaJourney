import java.util.Scanner;
public class odd_or_even {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num = input.nextInt();
        if((num % 2) == 0)
            System.out.println("Given number "  +num+   " is a even number ");
        else{
            System.out.println("The Given number " +num+ " is a odd number ");
        }


    }
}
