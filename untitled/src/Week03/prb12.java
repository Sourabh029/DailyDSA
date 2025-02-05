package Week03;

import java.util.Arrays;

public class prb12 {
    public static void main(String[] args) {

        int[]  nums = {10,12,11,9,6,19,11};

        prb12 prb = new prb12();
        int i = prb.maxFrequencyElements(nums);
        System.out.println(i);


    }

    public int maxFrequencyElements(int[] nums) {

        int max = Arrays.stream(nums).max().getAsInt();
        int[] hash = new int[max+1];
        for(int i=0;i< nums.length;i++)
        {
            hash[nums[i]]++;
        }
        int maxNum =0;
        int count=0 ;
        boolean flag = false;
        for(int i =0;i<hash.length;i++)
        {
            if(hash[i]>maxNum)
            {
                maxNum = hash[i];
                count=hash[i];
            } else if (hash[i]==maxNum) {
                count++;
            }
        }
        return count;
    }
}
