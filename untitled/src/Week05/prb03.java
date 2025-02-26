package Week05;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class prb03 {
    public static void main(String[] args) {

        prb03 prb03 = new prb03();
        String abacaba = prb03.maxSubaaray("ZZZAA");

        System.out.println(abacaba);

    }

    public String maxSubaaray(String str)
    {
        HashMap<String,Integer> map = new HashMap<>();

        for(int i =1;i<str.length();i++)
        {
            String tempStr = str.substring(i-1,i+1);
            if(map.containsKey(tempStr))
            {
                int value = map.get(tempStr);
                map.put(tempStr,value+1);
            }
            else
            {
                map.put(tempStr,1);
            }
        }

        String value = map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();

        return  value;

    }

}
