package Week07;

import java.util.HashMap;
import java.util.Map;

public class Prb09 {

    public static void main(String[] args) {
        Prb09 prb09 = new Prb09();
        int i = prb09.longestUniqueSubstring("mymfez");
        System.out.println(i);
    }

    int longestUniqueSubstring(String s) {
        // code here
        int i =0;
        int j =0;
        int count =0;
        int maxCount =0;
        Map<Character,Integer> countMap = new HashMap<>();
        for(i =0;i<s.length();)
        {
            if(countMap.containsKey(s.charAt(i)))
            {
                if(count>maxCount)
                {
                    maxCount=count;
                }
                j++;
                i=j;

                countMap.clear();
                count=0;
            }
            else
            {
                countMap.put(s.charAt(i),1);
                count++;
                i++;
            }
        }
        if(count>maxCount)
        {
            maxCount = count;
        }
        return maxCount;
    }
}
