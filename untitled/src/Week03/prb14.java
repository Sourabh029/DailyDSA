package Week03;

import java.util.Arrays;
import java.util.Scanner;

public class prb14 {
    public static void main(String[] args) {
        int n =2;
        Scanner scanner = new Scanner(System.in);
        while(n-->0)
        {
            int s = scanner.nextInt();
            int[] arr = new int[s];
            int[] res = new int[s];
            int k =0;

            for(int i =0;i<s;i++)
            {
                arr[i]=scanner.nextInt();
            }
            res[0] = arr[0];
            for(int i =1 ;i<s;i++)
            {
                if(res[i-1]>arr[i])
                {
                    int temp = res[i-1];

                    while(true)
                    {
                        if(temp%arr[i]==0)
                        {
                            res[i]=temp;
                            break;
                        }else
                        {
                            temp ++;
                        }
                    }
                } else if (res[i-1]<=arr[i]) {
                    res[i ]=arr[i];
                }
            }
            Arrays.stream(res).forEach(System.out::println);
        }
    }
}
