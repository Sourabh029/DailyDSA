package Week05;

public class prb1 {
    public static void main(String[] args) {
        String s1 = "aaaas";
        String s2 = "aaaAS";

        prb1 prb1= new prb1();
        int i = prb1.compareStrings(s1, s2);
        System.out.println(i);
    }

    public int compareStrings(String s1,String s2)
    {
        for(int i =0;i<s1.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i) || s1.charAt(i)==s2.charAt(i)-32 || s1.charAt(i)==s2.charAt(i)+32)
            {
                continue;
            }else
            {
                return -1;
            }
        }
        return 0;
    }
}
