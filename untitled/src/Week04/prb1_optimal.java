package Week04;

import java.util.Arrays;

public class prb1_optimal {

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};

        int n = arr.length;
        int[] arr2=new int[arr.length];
        arr2[n-1]=-1;
        int max = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {

            arr2[i] =max;
            if(arr[i]>max)
            {
                max = arr[i];
            }

        }
        Arrays.stream(arr2).forEach(System.out::println);
    }
}
