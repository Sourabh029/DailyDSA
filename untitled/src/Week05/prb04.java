package Week05;

import java.util.Collections;

public class prb04 {

    public static void main(String[] args) {
        prb04 prb04 = new prb04();
        boolean palindrome = prb04.isPalindrome(121);

        System.out.println(palindrome);
    }


    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String strBuilder = new StringBuilder(str).reverse().toString();


        return str.equals(strBuilder);

    }
}
