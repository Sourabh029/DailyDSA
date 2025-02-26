package Week05;

public class prb05 {


    public static void main(String[] args) {
        prb05 prb05= new prb05();
        String s = "Zeus was deified, saw Suez.";
        boolean palindrome = prb05.isPalindrome(s);
        System.out.println(palindrome);
    }

    public boolean isPalindrome(String s) {

        StringBuilder res = new StringBuilder() ;

        for(int i =0;i<s.length();i++)
        {
            char c= s.charAt(i) ;
            if(c>64 && c<=90)
            {
                c = (char) (c + 32);
                res.append(c);
            } else if (c>96 && c<=122) {
                res.append(c);
            }


        }

        System.out.println(res);
        String result = res.toString();
        String reverse = res.reverse().toString();


        return result.equals(reverse);

    }
}
