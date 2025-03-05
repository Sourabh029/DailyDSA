package Week06;

public class prb04 {

    public static void main(String[] args) {

        prb04 prb04 = new prb04();
        int i = prb04.countAsterisks("yo|uar|e**|b|e***au|tifu|l");
        System.out.println(i);

    }
    public int countAsterisks(String s) {
        int count =0;
        boolean pipe = false;
        for(int i =0;i<s.length();i++)
        {
            char val = s.charAt(i);
            if(val == '|' )
            {

                pipe =!pipe;
            } else if (!pipe ) {
                if(val=='*')
                {
                    count++;
                }
            }

        }
        return count;
    }
}
