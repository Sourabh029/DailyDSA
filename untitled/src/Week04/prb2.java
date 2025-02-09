package Week04;

import java.util.ArrayList;
import java.util.List;

public class prb2 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

    }

    public int countPairs(List<Integer> nums, int target) {

        int count =0;
        for(int i=0;i<nums.size();i++)
        {
            int n = nums.get(i);
            for(int j=i+1;j<nums.size();j++)
            {
                if(nums.get(i)+nums.get(j)>target)
                {
                    count++;
                }
            }
        }
        return count;

    }

}
