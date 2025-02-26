package Week05;

import java.util.Arrays;

public class prb02 {
    public static void main(String[] args) {

        prb02 prb02 = new prb02();
        char[] charArr= new char[]{'h','e','l','l','o'};
        prb02.reverseString(charArr);

        for(char i : charArr)
        {
            System.out.println(i);
        }


    }

    public void reverseString(char[] s) {

        int j = s.length-1;
        for(int i =0;i<s.length/2;i++)
        {
            char temp = s[i];
            s[i]=s[j];
            s[j] = temp;
            j--;

        }


    }
}
