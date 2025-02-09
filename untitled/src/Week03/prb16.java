package Week03;

public class prb16 {
    public static void main(String[] args) {

        int[] nums = new int[]{1,1,0,1,1,1};
        prb16 prb16 =   new prb16();
        int maxConsecutiveOnes = prb16.findMaxConsecutiveOnes(nums);

        System.out.println(maxConsecutiveOnes);

    }


    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int maxCount =0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
                if(count>maxCount)
                {
                    maxCount = count;
                }
            }
            else
            {
                count=0;
            }
        }
        return maxCount;
    }
}
