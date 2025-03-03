package Week05;

import java.util.Arrays;

public class prb9_2 {
    public static void main(String[] args) {
        prb9_2 prb92 = new prb9_2();
        prb92.removeDuplicates(new int[]{1,2,2});
    }

    public int removeDuplicates(int[] nums) {


        int i =0;
        int j = 1;
        int count =0;
        while(j<nums.length)
        {
            if(nums[i]==nums[j])
            {
                  nums[j]= Integer.MIN_VALUE;
                  j++;
                  count++;
            }
            else if(nums[i]!=nums[j])
            {
                i=j;
                j++;
            }
        }
        System.out.println(nums.length-count);
        i=0;
        j=1;
        while(j< nums.length)
        {
            if(nums[i]==-1 && nums[j]!=-1)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j]=temp;
                i++;
                j++;
            } else if (nums[i]!=-1 && nums[j]==-1) {
                    i++;
                    j++;
            }else if(nums[i]!=-1 && nums[j]!=-1)
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }




        Arrays.stream(nums).forEach(System.out::println);
        return 0;

    }
}
