package Week03;

import java.util.Arrays;

public class prb15_2 {
    public static void main(String[] args) {
        prb15 prb15 = new prb15();
        int[] nums = new int[]{-1, -100, 3, 99}; //-1 -1  3 99 // -1 -1 3 99    //t= -100
        int k = 2;

        prb15.rotate(nums, k);
        Arrays.stream(nums).forEach(System.out::println);
    }

    public void rotate(int[] nums, int k) {

        while (k-- > 0) {
            int temp = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }

            nums[0] = temp;
        }
    }





}
