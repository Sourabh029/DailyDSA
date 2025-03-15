package Week07;

import java.util.Scanner;

public class Prb04 {
    public static void main(String[] args) {

        int n = 6;
        int[] m = {4,2,10,6,5,6};

        Scanner scanner = new Scanner(System.in);
        Integer GreaterThenOrEqualTo = 1;
        Integer LessThenOrEqualTo = 2;
        Integer NotEqualTo = 3;

        while(n-->0)
        {
            int i =0;
            int start = 0;
            int end = Integer.MAX_VALUE;
            int ignore = 0;

            while(m[i]>0)
            {
                int a = scanner.nextInt();
                int k = scanner.nextInt();
                if(a==GreaterThenOrEqualTo && start<=k)
                {
                    start =k;
                } else if (a==LessThenOrEqualTo && end >=k) {
                    end = k;
                }else if(a==NotEqualTo && k>=start)
                {
                    ignore++;
                }


                m[i]=m[i]-1;

            }
            System.out.println((end - (start-1)) -ignore);
            i++;
        }
    }



}
