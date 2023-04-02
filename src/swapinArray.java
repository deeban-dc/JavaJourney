import java.util.Arrays;

public class swapinArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        swapArr(arr , 0 ,4); //which two index u gonna change

        System.out.println(Arrays.toString(arr));
    }

    static void swapArr(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
