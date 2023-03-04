import java.util.Scanner;
public class SimpleInterest {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the Principal Amount : " );
            int pramount = input.nextInt(); // principal amount
            System.out.print("Enter the No of Years :");
            int nyears = input.nextInt(); // no of years
            System.out.print("Enter the Rate of Interest ");
            int roi = input.nextInt(); // rate of interest
            int si=(pramount*nyears*roi)/100; // pnr/100
            System.out.println("The Simple Interest for the Given is : " +si+ " Rupees");





        }
    }
