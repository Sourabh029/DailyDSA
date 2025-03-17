package Week07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prb07 {

    public static void main(String[] args) {

        Prb07 prb07 = new Prb07();
        int i = prb07.maxVowels2("abciiidef", 3);
        System.out.println(i);
    }


    public int maxVowels2(String s, int k) {

        int max =0;
        int count =0;
        List<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        int i =k;
        int j =k;
        int l = s.length();

        for(int p =0;p<k;p++)
        {
            if(vowels.contains(s.charAt(p)))
            {
                count++;
            }
        }
        max =Math.max(max,count);

        for(int p =j;p<l;p++)
        {
            if(vowels.contains(s.charAt(p)))
            {
                count++;
            }
            if(vowels.contains(s.charAt(p-k)))
            {
                count--;
            }
            max =Math.max(max,count);
        }


        return max;

    }


    public int maxVowels(String s, int k) {

        int n = s.length();
        int ans = 0;
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr += isVowel(s.charAt(i));
        }
        ans = Math.max(ans, curr);
        for (int i = k; i < n; i++) {
            curr += isVowel(s.charAt(i));
            curr -= isVowel(s.charAt(i - k));
            ans = Math.max(ans, curr);
        }
        return ans;
    }


    private int isVowel(char c) {
        if (c == 'a') return 1;
        if (c == 'e') return 1;
        if (c == 'i') return 1;
        if (c == 'o') return 1;
        if (c == 'u') return 1;
        return 0;
    }
}
