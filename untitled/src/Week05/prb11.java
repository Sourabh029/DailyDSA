package Week05;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;

public class prb11 {
    public static void main(String[] args) {
        prb11 prb11 = new prb11();
        int i = prb11.singleNumber(new int[]{4,1,2,1,2});
        System.out.println(i);
    }

    public int singleNumber(int[] nums) {

        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int i =0;i<nums.length;i++)
        {
            if(!hash.containsKey(nums[i])) {
                hash.put(nums[i], 1);
            }
            else
            {
                hash.put(nums[i],hash.get(nums[i])+1);
            }
        }

        Integer first = hash.entrySet().stream().filter(x -> x.getValue() == 1).map(x -> x.getKey()).findFirst().get();
        return first;
    }
}
