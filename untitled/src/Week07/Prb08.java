package Week07;

import java.util.Arrays;
import java.util.Stack;

public class Prb08 {
    public static void main(String[] args) {
        Prb08 prb08 = new Prb08();
        int[] ints = prb08.sortedSquares(new int[]{-10000,-9999,-7,-5,0,0,10000});
        Arrays.stream(ints).forEach(System.out::println);
    }
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int j = nums.length-1;
        int k = nums.length-1;
        int i =0;

        while (i<=j)
        {
            int x = nums[i]*nums[i];
            int y = nums[j]*nums[j];
            if(x>y)
            {
                res[k--] = x;
                i++;
            }else
            {
                res[k--] = y;
                j--;
            }

        }


        return res;



    }
}
