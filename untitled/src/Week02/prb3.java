package Week02;

import java.util.Scanner;

public class prb3 {
    public static void main(String[] args) {
        int n =8;
        Scanner scanner = new Scanner(System.in);
        while (n-->0)
        {
            int ip= scanner.nextInt();
            if(ip%2==0 && ip%7==0)
            {
                System.out.println("Alice");
            }
            else if(ip%2!=0 && ip%9==0)
            {
                System.out.println("Bob");
            }
            else
            {
                System.out.println("Charlie");
            }

        }
    }
}
