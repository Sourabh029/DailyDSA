package Week02;

public class prb5 {
    public static void main(String[] args) {
        int n =153;
        int m =n;
        int sum =0;
        while(n>0)
        {
            int temp = n%10;
            sum = (int)Math.pow(temp,3) +sum;
            n=n/10;
        }
        if(sum==m)
        {
            System.out.println(true);
        }
    }
}
