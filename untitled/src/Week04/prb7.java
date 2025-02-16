package Week04;

public class prb7 {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{3,2,1}};
        prb7 prb7 = new prb7();
        int i = prb7.maximumWealth(arr);

        System.out.println(i);
    }



    public int maximumWealth(int[][] accounts) {

        int max =0;
        for(int i=0;i<accounts.length;i++)
        {
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++)
            {
                sum += accounts[i][j];
            }
            if(sum>max)
            {
                max = sum ;
            }
        }
        return max;
    }
}
