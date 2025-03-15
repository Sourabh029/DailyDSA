package Week07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prb03 {
    public static void main(String[] args) {

    }
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int max = 0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }

        }

        int[] hash = new int[max+1];

        for(int i =0;i<nums.length;i++)
        {
            hash[nums[i]]=hash[nums[i]]+1;
        }

        List<Integer> res = new ArrayList<>();
        for(int i =1;i<hash.length;i++)
        {
            if(hash[i]==0)
            {
                res.add(i);
            }
        }

        return res;

    }
}
