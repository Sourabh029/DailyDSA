package Week06;

public class prb03 {
    public static void main(String[] args) {
        prb03 prb03 = new prb03();
        String leEeetcode = prb03.makeGood("s");
        System.out.println(leEeetcode);
    }

    public String makeGood(String s) {
        int i =1;
        StringBuilder stringBuilder = new StringBuilder(s);
        while(i<stringBuilder.length())
        {
            char a = stringBuilder.charAt(i);
            char b = stringBuilder.charAt(i-1);
            if((a - b == 32) || (a - b == -32 ))
            {
                stringBuilder.delete(i-1,i+1);
                i=1;
            }else
            {
                i++;
            }
        }
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }
}
