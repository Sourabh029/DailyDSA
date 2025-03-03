package Week05;

import java.util.Arrays;

public class prb07 {

    public static void main(String[] args) {
        int[] nums = {4,2,4,0,0,3,0,5,1,0};

        prb07 prb07 = new prb07();
        prb07.moveZeroes(nums);

        Arrays.stream(nums).forEach(System.out::println);
    }

    public void moveZeroes(int[] nums) {

         int i=0;
         int j =i+1;
         int n = nums.length;
         while(j<n && i <n)
         {
             if(nums[i]==0 && nums[j]!=0)
             {
                 int temp = nums[i];
                 nums[i]=nums[j];
                 nums[j]=temp;
                 i++;
                 j++;
             }
             else if(nums[i] !=0 && nums[j]==0)
             {
                 i++;

             }
             else if(nums[i]==0 && nums[j]==0)
             {

                 j++;
             }
             else
             {
                 i++;
                 j++;
             }
         }
    }
}
