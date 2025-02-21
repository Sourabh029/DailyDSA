package Week04;

import java.util.ArrayList;
import java.util.List;

public class prb16 {
    public static void main(String[] args) {

    }

    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {



            int n = matrix[0].length;
            int m = matrix.length;
            int right = 0;
            int top = 0;
            int bottom = n-1;
            int left = m-1;
            List<Integer> arr = new ArrayList<>();

            while(top<=bottom && left>=right) {
                for (int i = top; i <= bottom ; i++) {
                    arr.add(matrix[right][i]);
                }
                right++;

                for (int i = right; i <= left; i++) {
                    arr.add(matrix[i][bottom]);
                }
                bottom--;

                if(right<=left) {
                    for (int i = bottom; i >= top; i--) {
                        arr.add(matrix[left][i]);
                    }
                    left--;
                }
                if(bottom>=top) {
                    for (int i = left; i >= right; i--) {
                        arr.add(matrix[i][top]);
                    }
                    top++;
                }
            }


            //    arr.stream().forEach(System.out::print);

            return arr;

        }
    }




}
