package Week04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class prb3 {
    public static void main(String[] args) {

        int[] arr = {26,2,16,16,5,5,26,2,5,20,20,5,2,20,2,2,20,2,16,20,16,17,16,2,16,20,26,16};
        prb3 prb3 = new prb3();
        boolean b = prb3.uniqueOccurrences(arr);
        System.out.println(b);
    }

    public boolean uniqueOccurrences(int[] arr) {
        int[] hash = new int[2002];
        for(int i =0;i< arr.length;i++)
        {
            hash[arr[i]+1000]++;
        }

        Set<Integer> set = new HashSet<>();
        int count =0;
        for(int i =0;i<hash.length;i++)
        {

            if(hash[i]!=0 )
            {
                set.add(hash[i]);
                count++;
            }

        }
        if(count!=set.size())
        {
            return false;
        }
        return true;

    }
}
