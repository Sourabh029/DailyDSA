package Week04;

import java.util.Scanner;

public class prb4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while(n-->0)
        {
            int num = scanner.nextInt();

            int[] arr = new int[num];
            for(int i = 0;i<num ;i++)
            {
                arr[i]=scanner.nextInt();
            }

            if(arr.length==1)
            {
                System.out.println(arr[0]);
                continue;
            }
            int min =0;
            int max = 0;

            for(int i = 0;i<num ;i++)
            {
                if(arr[i]>arr[max])
                {
                    max = i;
                }
                if(arr[i]<arr[min])
                {
                    min = i;
                }


            }




            System.out.println(min+1 + " " + (max+1));

        }

    }
}
