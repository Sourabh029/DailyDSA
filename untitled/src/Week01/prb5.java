package Week01;

public class prb5 {
    public static void main(String[] args) {
        int n =5;
        int i=0;
        prb5 obj = new prb5();
        int[] arr = {5009 ,7 ,10000 ,10,5009};
        //
        while(n-->0)
        {
            int num = arr[i++];
            //int count = obj.countNum(num);
            //System.out.println(count);
            obj.split(num);

        }
    }

    public void split(int num)
    {
        int c =0;
        while(num>0)
        {
            int count = countNum(num);
            int temp = num%count;
            System.out.print(num - temp+" ");
            num = temp;
            //System.out.println(num);
            count = count/10;
            c++;
        }
        System.out.println();
        System.out.println(c);
    }

    public int countNum(int num)
    {
        int c =0;
        while(num>0)
        {
            c++;
            num=num/10;
        }
        int n =1;
        while(c-->0)
        {
            n=n*10;
        }
        return n/10;
    }

}
