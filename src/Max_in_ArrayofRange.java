public class Max_in_ArrayofRange {
    public static void main(String[] args) {
        int[] arr = {842, 376, 22, 701, 961, 280, 785, 686};
        System.out.println(maxinrange(arr , 3, 6)); //range of the array to find the max
    }

    static int maxinrange(int[] arr, int start, int end) {
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
