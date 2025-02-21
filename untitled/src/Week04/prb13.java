package Week04;

public class prb13 {
    public static void main(String[] args) {

        prb13 prb13 = new prb13();
        int i = prb13.diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println(i);

    }

    public int diagonalSum(int[][] mat) {

        int n = mat.length-1;
        int sum =0;
        for(int i =0;i<=n;i++)
        {
            sum+=mat[i][i];
        }
        System.out.println(sum);
        for(int i =0;i<=n;i++)
        {
            sum+=mat[i][n-i];
        }
        System.out.println(sum);
        int mid = n/2;

        if(n%2==0) {
            sum = sum - mat[mid][mid];
        }
        System.out.println(sum);
        return sum;

    }


}
