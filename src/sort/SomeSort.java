package sort;

import java.util.concurrent.ThreadLocalRandom;

public class SomeSort {

    public static void main(String[] args) {

    }

//    public int[] sortArray(int[] nums) {
//        for (int i = 2; i < 10000000; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//    }

    public static int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public static final int[] generateRandomArray(int length) {
        int[] res = new int[length];
        for (int i = 0; i < length; ++i) {
            res[i] = ThreadLocalRandom.current().nextInt(length * 10);
        }
        return res;
    }
}
