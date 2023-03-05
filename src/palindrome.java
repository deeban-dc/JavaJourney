import java.util.Scanner;
public class palindrome {
    //FOR JUST REVERSING A STRING
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the String : ");
//        String word = input.next();
//        for (int i = word.length()-1; i >= 0; i--)
//            System.out.print(word.charAt(i));

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String word = input.next();    //gets the string input
        String word2 = "";             //creates  a empty string [replica for the given string]
        for (int i = word.length()-1; i >= 0; i--) //4-letter word means index will be 3. so index = 4 -1 =3; decrements for reversing
            word2 = word2+word.charAt(i); //empty string + original string = replica that is used for comparing in if-else
        System.out.println(word2);
        if(word.equals(word2))
            System.out.println("The Given String is a Palindrome");
        else System.out.println("The Given String is not a Palindrome");
    }
}
