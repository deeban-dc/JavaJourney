import java.util.Scanner;
public class SimpleCalcusingswitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number :");
        int num1 = input.nextInt();
        System.out.print("Enter the Second Number :");
        int num2 = input.nextInt();
        System.out.print("Enter The Operator : ");
        char op = input.next().charAt(0);
        if(op == '+'){
            int sum=num1+num2;
            System.out.print("The Sum is " +sum);
        } else if (op== '-') {
            int diff=num1-num2;
            System.out.print("The Difference is " +diff);
        } else if (op=='*') {
            int prod = num1*num2;
            System.out.print("The Product is " +prod);
        } else if (op=='/') {
            int div = num1/num2;
            System.out.print("The Quotient is" +div);
        } else {
            System.out.println("ERROR 404");
        }


    }
}
