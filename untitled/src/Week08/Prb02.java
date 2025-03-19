package Week08;

public class Prb02 {
    public static void main(String[] args) {

        Prb02 prb02 = new Prb02();
        int i = prb02.maximumSumSubarray(new int[]{100, 200, 300, 400}, 1);
        System.out.println(i);
    }
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int j=k;
        int sum =0;
        int maxSum =0;
        for(int p=0;p<k;p++)
        {
            sum += arr[p];
        }
        maxSum = Math.max(sum,maxSum);

        for (int i =1;j<arr.length;i++)
        {
            sum = sum - arr[i-1];
            sum = sum + arr[j];
            maxSum=Math.max(maxSum,sum);
            j++;
        }

        return maxSum;
    }

}
