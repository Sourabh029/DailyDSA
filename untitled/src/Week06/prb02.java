package Week06;

import java.util.HashMap;

public class prb02 {
    public static void main(String[] args) {

        prb02 prb02 = new prb02();
        int i = prb02.numJewelsInStones(new String("aA"), new String("aAAbbbb"));
        System.out.println(i);
    }

    public int numJewelsInStones(String jewels, String stones) {
        char[] jewelsCharArray = jewels.toCharArray();
        char[] stonesCharArray = stones.toCharArray();
        int count =0;
        for(int i =0;i<jewelsCharArray.length;i++)
        {
            for(int j =0;j<stonesCharArray.length;j++)
            {
                if(jewelsCharArray[i]==stonesCharArray[j])
                {
                    count++;
                }
            }
        }
        return count;

    }

}
