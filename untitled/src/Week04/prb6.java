package Week04;

public class prb6 {
    public static void main(String[] args) {

    }

    int sumOfMatrix(int N, int M, int[][] Grid) {
        // code here
        int mul =1;
        for(int i=0;i<N;i++)
        {
            for(int j =0;j<M;j++)
            {
                mul*=Grid[i][j];
            }
        }

        return mul;

    }
}
