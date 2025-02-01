package Week01;

public class prb6 {
    public static void main(String[] args) {
        int a =12;
        int b =6;
        int c =0;
        int min = Math.min(a,b);
        for(int i=1;i<=min;i++)
        {
            if(a%i==0 && b%i==0)
            {
                c++;
            }
        }
        System.out.println(c);

    }
}
