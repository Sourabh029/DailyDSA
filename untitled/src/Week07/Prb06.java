package Week07;

public class Prb06 {
    public static void main(String[] args) {

        Prb06 prb06 = new Prb06();
        double maxAverage = prb06.findMaxAverage(new int[]{5}, 1);
        System.out.println(maxAverage);
    }

    public double findMaxAverage(int[] nums, int k) {

        int sum =0;
        int maxsum =0;
        int avg =0;
        for(int i =0;i<k;i++)
        {
            sum+=nums[i];
        }
        maxsum=sum;
        int m = 0;
        for(int i =k;i< nums.length;i++)
        {
            sum = (sum - nums[m])+nums[i];
            if(sum>maxsum)
            {
                maxsum = sum;
            }
            m++;
        }


        return (double) maxsum /k;

    }
}
