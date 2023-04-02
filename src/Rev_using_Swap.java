import java.util.Arrays;

public class Rev_using_Swap { //using the 2 pointer method
    public static void main(String[] args) {
        int[] arr = {642, 160, 422, 363, 797, 366, 9, 755};
        //swapArr(arr , 0 ,4); //which two index u gonna change
        reverseArr(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void reverseArr(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            swapArr(arr, start , end);
            start++;
            end--;
        }
    }
    static void swapArr(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
