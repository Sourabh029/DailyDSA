package Week02;

public class prb6 {
    public static void main(String[] args) {
        int a =1;
        int b =5;
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        int gcd =0;
        for(int i =1;i<=max;i++)
        {
            if(min%i==0 && max%i==0)
            {
                gcd = i;
            }
        }
        System.out.println(gcd);

    }
}
