package Week03;

public class prb7 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        prb7 prb7 = new prb7();
        boolean b = prb7.arraySortedOrNot(arr);

        System.out.println(b);
    }

    public boolean arraySortedOrNot(int[] arr) {
        // code here
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]>arr[i])
            {
                return false;
            }

        }
        return true;
    }
}
