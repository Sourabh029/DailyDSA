package Week03;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class prb17 {
    public static void main(String[] args) {
        int[] nums =  new int[]{0};
        prb17 prb17= new prb17();
        prb17.moveZeroes(nums);

        Arrays.stream(nums).forEach(System.out::println);
    }

    public void moveZeroes(int[] nums) {
        Queue<Integer> n = new LinkedList<>() ;
        int zeroCount =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                n.add(nums[i]);
            }
            else
            {
                zeroCount++;
            }
        }

        int i=0;
        while(!n.isEmpty())
        {
            nums[i]=n.poll();
            i++;
        }

        while(zeroCount-->0)
        {
            nums[i]=0;
            i++;
        }

    }
}
