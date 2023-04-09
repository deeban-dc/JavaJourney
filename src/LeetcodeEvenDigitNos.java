// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class LeetcodeEvenDigitNos {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896, 816, 762, 764, 459, 419, 27, 539, 91};
        System.out.print(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) { //iterates using for each loop
        int count = 0;                          //iterates for each element using the even method
        for (int num : nums) {                  //and if it's true, count is increased (no of even digit nums)
            if (even(num)) count++;
        }
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int num = nums[i];
//            if (even(num)) {
//                count++;
//            }
//        }

        return count;
    }
    public static boolean even(int num) { //checks whether the no of digits like 4, 2 , 3 are even
        int NoOfDigits = digits(num);
        /*if (NoOfDigits % 2 == 0) {
            return true;
        }
        return false; */
        return NoOfDigits % 2 == 0;

    }
    public static int digits(int num) { //returns no of digits in each elements in array eg: 4,2, 3
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
