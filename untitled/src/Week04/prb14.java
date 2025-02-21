package Week04;

import java.util.ArrayList;
import java.util.List;

public class prb14 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = snakePattern(new int[][]{{10,20,30,40}, {50, 60,70, 80}, {90, 100, 110,120},{130,140,150,160}});
        for (Integer integer : integers) {
            System.out.print(integer+" ");
        }
    }

    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i< matrix.length;i++)
        {
            for(int j =0;j< matrix.length;j++)
            {
                arr.add(matrix[i][j]);
            }
            i++;
            if(i< matrix.length) {
                for (int j = matrix.length-1; j >= 0; j--) {
                    arr.add(matrix[i][j]);
                }
            }
            else
            {
                break;
            }
        }
        return arr;
    }

}
