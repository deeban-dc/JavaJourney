import java.util.Scanner;
public class INR_USD_Conv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Change to Usd or Inr? "); // which currency you want to change into
        String decision = input.next(); //input for currency
        if (decision.equals("usd")) {
            System.out.print("Enter the Amount You want to convert into usd :");
            int inr = input.nextInt();
            double inrtousd = inr / 81.84; //inr is converted into usd
            System.out.println(inrtousd + "$");
        } else
        {

            System.out.print("Enter the amount you want to convert into inr :");
            int usd = input.nextInt();
            double usdtoinr = usd * 81.84; //usd is converted int inr
            System.out.println(usdtoinr + "Rupees");
        }

    }
}





