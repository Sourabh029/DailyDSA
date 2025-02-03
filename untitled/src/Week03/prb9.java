package Week03;

public class prb9 {
    public static void main(String[] args) {

        int nums[] ={1,1,1,1};
        prb9 prb9 = new prb9();
        int i = prb9.numIdenticalPairs(nums);

        System.out.println(i);
    }

    public int numIdenticalPairs(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j = i+1 ;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}
