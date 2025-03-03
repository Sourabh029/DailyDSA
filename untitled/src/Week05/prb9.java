package Week05;

import java.util.Arrays;

public class prb9 {
    public static void main(String[] args) {

        prb9 prb9 = new prb9();
        int i = prb9.removeDuplicates(new int[]{1,2});
        System.out.println(i);

    }

    public int removeDuplicates(int[] nums) {

        int count = 0 ;

        int j = 1;
        int i=0;

        for(int n =1;n< nums.length;n++)
        {
            if(nums[n]==nums[n-1])
            {
                count++;
            }
        }
        if(count == 0)
        {

            return nums.length- count;
        }

        while (j< nums.length)
        {
            if(nums[i]==nums[j])
            {
                i++;
                j++;

            }
            else if(nums[i]!=nums[j] && i+1!=j)
            {
                if(nums[i]<nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;

            }
        }

        Arrays.stream(nums).forEach(System.out::println);

        return nums.length- count;

    }

}
