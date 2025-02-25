package Week04;

public class prb18 {
    public static void main(String[] args) {

        prb18 prb18= new prb18();
        boolean toeplitzMatrix = prb18.isToeplitzMatrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println(toeplitzMatrix);
    }

    public boolean isToeplitzMatrix(int[][] matrix) {

        for(int i =1;i<matrix.length;i++)
        {
            for(int j =1;j<matrix[0].length;j++)
            {
                if(!(matrix[i][j]==matrix[i-1][j-1]))
                {
                    return false;
                }
            }
        }
        return true;

    }
}
