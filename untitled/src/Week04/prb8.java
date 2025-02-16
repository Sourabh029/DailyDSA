package Week04;

public class prb8 {
    public static void main(String[] args) {

        int[][] A= {{1,2},{2,1}};
        prb8 prb8= new prb8();
        int i = prb8.sumOfRowCol(A.length, A[0].length, A);
        System.out.println(i);

    }
    int sumOfRowCol(int N, int M, int A[][]) {
        // code here
        int boundry = Math.min(N,M);

        int k =0;
        for(int i=0;i<N;i++)
        {
            int row_sum = 0;
            int col_sum =0;
            for(int j=0;j<M;j++)
            {
                row_sum += A[i][j];

            }
            for(int j=0;j<N;j++)
            {
                col_sum += A[j][i];

            }
            if(row_sum!=col_sum)
            {
                return 0;
            }

        }
        return 1;
    }
}
