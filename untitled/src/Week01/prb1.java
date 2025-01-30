package Week01;

public class prb1 {
    public static void main(String[] args) {

        int n =12;
        int sum =0;
        while(n>0)
        {
            int temp =n%10;
            sum +=temp;
            n=n/10;
        }

        System.out.println(sum);

    }
}
