package Week06;

public class prb05 {

    public static void main(String[] args) {

        prb05 prb05 = new prb05();
        String s = prb05.reverseOnlyLetters("Test1ng-Leet=code-Q!");

        System.out.println(s);
    }

    public String reverseOnlyLetters(String s) {
        int i =0;
        int j = s.length()-1;

        StringBuilder stringBuilder = new StringBuilder(s);
        while (j>i)
        {
            char a = stringBuilder.charAt(i);
            char b = stringBuilder.charAt(j);
            if(stringBuilder.charAt(i) == '-' || !((a>=65 && a<=90) || (a<=122 && a>=97))  )
            {
                i++;
            } else if (stringBuilder.charAt(j)=='-' || !((b>=65 && b<=90) || (b<=122 && b>=97))) {
                j--;
            } else{
                char temp = stringBuilder.charAt(i);
                stringBuilder.setCharAt(i,stringBuilder.charAt(j));
                stringBuilder.setCharAt(j,temp);
                i++;
                j--;
            }

        }

        return stringBuilder.toString();
    }
}
