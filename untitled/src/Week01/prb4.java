package Week01;

public class prb4 {
    public static void main(String[] args) {
        int n = 6;

        while(n>=0)
        {
            if(n==0)
            {
                System.out.println(false);
            }

            if(n%2==0)
            {
                n=n/2;
            }
            else if(n%3==0)
            {
                n=n/3;
            }
            else if(n%5==0)
            {
                n=n/5;
            }
            else
            {

                break;
            }
        }
        if(n==1)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

    }
}
