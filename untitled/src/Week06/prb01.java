package Week06;

public class prb01 {
    public static void main(String[] args) {
        prb01 prb01 = new prb01();

        String hello = prb01.toLowerCase("al&phaBET");
        System.out.println(hello);
    }

    public String toLowerCase(String s) {

        StringBuilder stringBuilder = new StringBuilder(s);
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)>96 && s.charAt(i)<123)
            {
                continue;
            }
            else if(s.charAt(i)>64 && s.charAt(i)<91)
            {
                stringBuilder.setCharAt(i,(char)(s.charAt(i)+32));
            }
        }

        return stringBuilder.toString();
    }

}
