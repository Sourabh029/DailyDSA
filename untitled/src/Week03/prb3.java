package Week03;

public class prb3 {
    public static void main(String[] args) {
        for (int i=0;i<5;i++)
        {
            for (int j =0;j<5-i;j++)
            {
                System.out.print(" ");
            }


            for(int j =0;j<=2*i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
