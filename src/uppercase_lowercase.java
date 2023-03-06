import java.util.Scanner;

public class uppercase_lowercase {
    public class workspace {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a letter :");
            int ch=input.next().trim().charAt(0);
            if(ch>='a'&& ch<= 'z'){
                System.out.println("lowercase");
            }
            else {
                System.out.println("uppercase");
            }
        }

    }

}
