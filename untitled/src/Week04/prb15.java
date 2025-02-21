package Week04;

public class prb15 {
    public static void main(String[] args) {

        prb15 prb15 = new prb15();
        prb15.transpose(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }

    public int[][] transpose(int[][] matrix) {

        int[][] res = new int[matrix.length][matrix.length];
        for(int i =0;i<matrix.length;i++)
        {
            for(int j =0;j<matrix[0].length;j++)
            {
                res[i][j]=matrix[j][i];
            }
        }





        return res;
    }


}
