package Week02;

public class lcm {
    public static void main(String[] args) {
        int a=1;
        int b =2;
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        int i=1;
        int j=1;
        while (true)
        {
            int ai=min*i;
            int bj=max*j;
            if(ai==bj)
            {
                System.out.println(ai);
                break;
            } else if (ai>bj) {

                j++;
            } else if (bj>ai) {
                i++;
            }
        }

    }
}
