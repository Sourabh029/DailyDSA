package Week04;

import java.util.Arrays;

public class prb1 {
    public static void main(String[] args) {
            int[] arr = {17,18,5,4,6,1};
            for(int i=0;i<arr.length-1;i++)
            {
                int max =Integer.MIN_VALUE;
                for(int j = i+1;j<arr.length;j++)
                {
                    if(arr[j]>max)
                    {
                        max = arr[j];
                    }
                }
                arr[i]=max;
            }
            arr[arr.length-1]=-1;
        Arrays.stream(arr).forEach(System.out::println);
    }
}
