import java.util.Scanner;

public class no_of_letters_inastring {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            //QN is N = 11312; Answer should be No of 1's ie; '3'

            int n = 1191191112;
            int count = 0;
            while (n > 0) {
                int rem = n % 10;
                if (rem == 1) {
                    count++;
                }
                n /= 10;
            }
            System.out.println(count);


        }
    }




