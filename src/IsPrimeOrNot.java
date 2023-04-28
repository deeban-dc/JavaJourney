import java.util.Scanner;
public class IsPrimeOrNot {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        boolean ans = Isprime(num);
        System.out.println(ans);

    }

     static boolean Isprime(int num) {

        boolean flag = true;
        if(num < 2){
            flag = false;
        }
        else if(num == 2 || num == 3){
            flag = true;
        }
        else if(num % 2 == 0 || num % 3 == 0){
            flag = false;
        }
        else{
            for(int i = 2 ; i < num ; i++ ){
                if(num % i == 0){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
