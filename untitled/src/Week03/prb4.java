package Week03;

public class prb4 {
    public static void main(String[] args) {

        for (int i=0;i<6;i++)
        {
            for (int j =0;j<i;j++)
            {
                System.out.print(" ");
            }

            for(int j =0;j<6*2-i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}