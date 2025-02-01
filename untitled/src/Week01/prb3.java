package Week01;

import java.util.Scanner;

public class prb3 {
    public static void main(String[] args) {
        int n = 2;
        Scanner sc = new Scanner(System.in);
        while(n-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if(a+b==c)
            {
                System.out.println("+");
                
            } else if (Math.abs(a-b)==c) {
                System.out.println("-");
            }

        }
    }
}
