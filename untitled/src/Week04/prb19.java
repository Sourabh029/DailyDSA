package Week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prb19 {
    public static void main(String[] args) {

        prb19 prb19= new prb19();
        int[] ints = prb19.matrixDiagonally(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        Arrays.stream(ints).forEach(System.out::println);
    }
    public int[] matrixDiagonally(int[][] mat) {

        int count = 0;
        int i = 0;
        int j = 0;
        int k =0;
        int n = mat.length;
        int[] arr = new int[n*n];
        boolean flag = false;
        while (count < n * n) {
            if (!flag) {
                while (i >= 0 && j < n ) {
                    arr[k]=(mat[i][j]);
                    k++;
                    count++;
                    if (j == n-1) {
                        i++;
                        break;
                    } else if (i == 0) {
                        j++;
                        break;

                    }
                    i--;
                    j++;
                }
                flag = true;
            }
            else
            {
                while(i<n && j>=0)
                {
                    arr[k]=mat[i][j];
                    k++;
                    count++;
                    if(i==n-1)
                    {
                        j++;
                        break;
                    } else if (j==0) {
                        i++;
                        break;

                    }
                    i++;
                    j--;
                }

                flag =false;

            }

        }
        return arr;
    }
}
