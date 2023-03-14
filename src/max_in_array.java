import java.util.*;

public class max_in_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++) arr[i] = input.nextInt();
        input.close();

        System.out.println(getMax(arr)); }
    public static int getMax(int[] arr) {
        int max = arr[0];
        for ( int i =0; i< arr.length; i++)
            if(max<arr[i]) max = arr[i];
        return max;
    }
}

