import java.util.Scanner;
 public class armstrong_number {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the Number :");
         int no1= input.nextInt(); //getting input
         int no2=no1; //assigning a variable to compare with input
         int arm =0;
         do{
             int rem=no1 % 10; //gives the last number [3 digit number]
             arm = arm+(rem*rem*rem); // 0 + last digit cube
             no1 = no1/10;  //quotient will be first two digits
         }
         while(no1>0); //the condition
         if(no2==arm)
             System.out.println("ARM");
         else System.out.println("Not a armstrong number");
     }


 }

