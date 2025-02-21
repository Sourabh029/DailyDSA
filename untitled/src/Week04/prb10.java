package Week04;

import java.math.BigInteger;
import java.util.Arrays;

public class prb10 {
    public static void main(String[] args) {

        prb10 prb10 = new prb10();
        int[] ints = prb10.plusOne(new int[]{6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 3});

        Arrays.stream(ints).forEach(System.out::println);
    }

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }


        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }




}
