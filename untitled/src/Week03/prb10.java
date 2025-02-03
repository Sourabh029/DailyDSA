package Week03;

import java.util.Arrays;

public class prb10 {
    public static void main(String[] args) {
        int arr[] = {16,6,1, 8, 9, 15, 17, 6, 9, 2, 15, 1, 1, 10, 12, 12};

        prb10 prb10 = new prb10();
        int[] ints = prb10.minAnd2ndMin(arr);

        Arrays.stream(ints).forEach(System.out::println);
    }

    public int[] minAnd2ndMin(int arr[]) {
        // code here
        int smallest = Integer.MAX_VALUE;
        int secondsmallest =  Integer.MAX_VALUE ;

        for(int i=0;i<arr.length;i++)
        {
            if(smallest>arr[i] )
            {

                secondsmallest = smallest;
                smallest = arr[i];


            }
            else if( secondsmallest>arr[i] && smallest<arr[i])
            {
                secondsmallest = arr[i];
            }

        }

        //System.out.println(smallest);


//        int smallest = arr[0]; //2,4,3,5,6,1
//        int secondsmallest = -1;
//        int pos = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if (smallest > arr[i]) {
//                secondsmallest = smallest;
//                smallest = arr[i];
//                pos =  i;
//            }
//
//        }
//
//        if (secondsmallest == -1)
//        {
//
//            arr[pos] = Integer.MAX_VALUE;
//            for (int i = 0; i < arr.length; i++) {
//                if (secondsmallest > arr[i]) {
//                    secondsmallest = smallest;
//                    smallest = arr[i];
//
//                }
//
//            }
//        }


        return new int[] {smallest,secondsmallest};

    }
}
