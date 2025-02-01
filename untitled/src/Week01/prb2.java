package Week01;

public class prb2 {
    public static void main(String[] args) {
        int num =38;
        int sum =0;
        int i = addDigits(num);

        System.out.println(i);
    }

    public static int addDigits(int num )
    {
        int sum =0;
        do{
            int n =num;
            sum =0;
            while(n>0)
            {
                int temp = n%10;
                sum +=temp;
                n=n/10;
            }
            num =sum;
        }while(sum>9);

        return sum;

    }


}
