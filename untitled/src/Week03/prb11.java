package Week03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class prb11 {

    public static void main(String[] args) {
        int n = 2;
        Scanner scanner = new Scanner(System.in);
        while(n-->0)
        {
            int a = scanner.nextInt();
            int[] arr = new int[a];
            for(int i=0;i<arr.length;i++)
            {
                arr[i] = scanner.nextInt();
            }
            int max =  Arrays.stream(arr).max().getAsInt();

            int[] nums =  new int[max+1];

            for(int i =0;i<arr.length;i++)
            {
                nums[arr[i]]++;
            }
            int maxNum =0;
            int count =0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]>maxNum)
                {
                    maxNum = nums[i];
                    count =i;
                }
            }
            System.out.println("count = "+ maxNum + "num "+count );


        }


    }
}

