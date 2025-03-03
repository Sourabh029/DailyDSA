package Week05;

import java.util.Arrays;

public class prb8 {
    public static void main(String[] args) {

        prb8 prb8 = new prb8();
        prb8.rotate(new int[]{1,2,3},5);
    }

    public void rotate(int[] nums, int k) {

        if(k> nums.length)
        {
            k = k%nums.length;
        }
        int n = nums.length - k ;
        int j = nums.length-1;
        for(int i =n;i<j;i++ )
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j--;
        }

        j = n-1;
        for(int i =0;i<j;i++ )
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j--;
        }

        j= nums.length-1;
        for(int i =0;i<j;i++ )
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j--;
        }


        Arrays.stream(nums).forEach(System.out::println);

    }


}
