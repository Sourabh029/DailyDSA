package Week03;

public class prb6 {
    public static void main(String[] args) {
     int[] arr  = {1, 2, 3, 4};
     prb6 prb6 = new prb6();
     prb6.arraySum(arr);
    }

    int arraySum(int arr[]) {
        // code here
        int n = arr.length;
        int i=0;
        int sum =0;
        while(n-->0)
        {
            sum+=arr[i];
            i++;
        }

        return sum;

    }
}
