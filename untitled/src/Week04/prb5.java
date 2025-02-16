package Week04;

import java.util.Arrays;
import java.util.Scanner;

public class prb5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int i =0;
        while(n-->0)
        {
            arr[i] = scanner.nextInt();
            i++;
        }

        int[] negatives = new int[2] ;
        negatives[0]= 1;

        for(i =0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                negatives[1]=arr[i];
                arr[i]=0;
                break;
            }
        }

        int[] zeros = new int[2];
        zeros[0]=1;
        for(i =0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                zeros[1]=arr[i];
                break;
            }
        }

        int[] positives=new int[arr.length-1];
        int multiple =1;
        int k= 0;
        for(i =0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                multiple*=arr[i];
                positives[k]=arr[i];
                k++;
            }
        }
        if(multiple>0)
        {
            positives[positives.length-1]=1;


        }else
        {
            positives[positives.length-1]=-1;
        }

        Arrays.stream(positives).forEach(System.out::print);
        System.out.println();
        Arrays.stream(negatives).forEach(System.out::print);
        System.out.println();
        Arrays.stream(zeros).forEach(System.out::print);



    }
}
