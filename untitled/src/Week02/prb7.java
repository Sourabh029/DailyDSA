package Week02;

import java.util.Scanner;

public class prb7 {
    public static void main(String[] args) {
        int n =2;
        Scanner scanner = new Scanner(System.in);

        while(n-->0)
        {
            int sum = 0;
            int prd=1;
            int a = scanner.nextInt();
            for(int i=1;i<=a;i++)
            {
                sum+=i;
                prd*=i;
            }
            if(sum%prd==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
