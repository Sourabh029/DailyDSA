package Week07;

import java.util.*;

public class Prb01 {
    public static void main(String[] args) {
        Prb01 prb01 = new Prb01();
        prb01.rearrange(new ArrayList<>(Arrays.asList(-5, -2, 5, 2, 4, 7, 1, 8, 0, -8)));
    }
    void rearrange(ArrayList<Integer> arr) {
        // code here
        Queue<Integer> negatives = new ArrayDeque<>();
        Queue<Integer> positives = new ArrayDeque<>();

        for(int i =0;i<arr.size();i++)
        {
            if(arr.get(i)>=0)
            {
                positives.add(arr.get(i));
            }else {
                negatives.add(arr.get(i));
            }
        }
        arr.clear();
        for (int i = 0;!positives.isEmpty() && !negatives.isEmpty(); i++)
        {
            if(i%2==0)
            {
                arr.add(positives.poll());
            }else
            {
                arr.add(negatives.poll());
            }
        }
        while(!negatives.isEmpty())
        {

            arr.add(negatives.poll());
        }
        while (!positives.isEmpty())
        {
            arr.add(positives.poll());
        }

        System.out.println(arr);

    }
}
