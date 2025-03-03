package Week05;

import java.util.Arrays;

public class prb13 {
    public static void main(String[] args) {

        prb13 prb13 = new prb13();
        int[] ints = prb13.twoSum(new int[]{3,3}, 6);
        Arrays.stream(ints).forEach(System.out::println);
    }

    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];
        for(int i =0;i<nums.length;i++) {
            int j=i+1;
            while (j < nums.length) {
                if (target - nums[j] == nums[i]) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                } else {
                    j++;
                }
            }

        }
        return res;
    }

}
