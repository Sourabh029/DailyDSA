package Week07;

public class Prb05 {
    public static void main(String[] args) {

        Prb05 prb05 = new Prb05();
        prb05.rotate(new int[] {1,2,3,4,5});
    }
    public void rotate(int[] arr) {
        // code here
        int temp = arr[arr.length-1];
        for(int i = arr.length-1;i>0;i--)
        {
            arr[i]= arr[i-1];
        }
        arr[0]=temp;
    }
}
