package Week03;

import java.util.Arrays;

public class prb13 {
    public static void main(String[] args) {

        int[] nums =  new int[]{2,5};
        prb13 prb = new prb13();
        int[] ints = prb.numberGame(nums);

        Arrays.stream(ints).forEach(System.out::println);
    }

    public int[] numberGame(int[] nums) {

        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length-1;)
        {
            int alice = smallest(nums);
            int bob =  smallest(nums);
            arr[i]=bob;
            i++;
            arr[i]=alice;
            i++;
        }

        return arr;


    }

    public int smallest(int[] nums)
    {
        int smallest = Integer.MAX_VALUE;
        int index = -1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<smallest)
            {
                smallest=nums[i];
                index = i;
            }
        }
        nums[index] = Integer.MAX_VALUE;
        return smallest;
    }


}
