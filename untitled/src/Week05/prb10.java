package Week05;

import java.util.Arrays;

public class prb10 {
    public static void main(String[] args) {

        prb10 prb10 = new prb10();
        int i = prb10.missingNumber(new int[]{0, 1});
        System.out.println(i);
    }

    public int missingNumber(int[] nums) {


        int[] has  = new int[nums.length+1];

        for(int i =0;i<nums.length;i++)
        {
            has[nums[i]]++;
        }

        for(int i =0;i<has.length;i++)
        {
            if(has[i]==0)
            {
                return i;
            }
        }


        return -1;
    }

}
