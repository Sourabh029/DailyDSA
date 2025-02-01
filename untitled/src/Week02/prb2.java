package Week02;

import java.util.Scanner;

public class prb2 {
    public static void main(String[] args) {
        int n =10;
        Scanner scanner = new Scanner(System.in);
        while(n-->0)
        {
            int a =scanner.nextInt();
            int b =scanner.nextInt();
            int c =scanner.nextInt();

            if(a==b )
            {
                System.out.println(c);
            } else if (b==c) {
                System.out.println(a);

            }else
            {
                System.out.println(b);
            }

        }
    }
}
