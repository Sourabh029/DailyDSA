package Week04;

public class prb12 {

    public static void main(String[] args) {

        int[][] Mat ={{1,2,3},{6,5,4},{7,8,9}};
        prb12 prb12 = new prb12();
        int i = prb12.sortedCount(Mat.length, Mat[0].length, Mat);

        System.out.println(i);
    }


    int sortedCount(int N, int M, int Mat[][]) {
        // code here
        boolean flag = false;
        int count=0;
        for(int i =0;i<N;i++) {

            boolean ascSorted = isAscSorted(Mat[i]);
            boolean descSorted = isDscSorted(Mat[i]);

            if((ascSorted || descSorted))
            {
              count++;
            }

        }


        return count;

    }


    public boolean isAscSorted(int[] arr)
    {
        int init = arr[0];

        for(int i =1;i<arr.length;i++)
        {
            if(!(arr[i-1]>arr[i]))
            {
                return false;
            }
        }
        return true;
    }


    public boolean isDscSorted(int[] arr)
    {


        for(int i =1;i<arr.length;i++)
        {
            if(!(arr[i-1]<arr[i]))
            {
                return false;
            }
        }
        return true;
    }




}
