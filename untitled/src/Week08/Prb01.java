package Week08;

import java.util.Arrays;

public class Prb01 {
    public static void main(String[] args) {
        Prb01 prb01 = new Prb01();
        int[] arr =new int[]{1,2,3,0,0,0};
        prb01.merge(arr,3,new int[]{1,2,3},3);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n;
        m--;
        n--;
        k--;

        while (n>=0 && m>=0) {
            if (nums1[m] < nums2[n]) {
                nums1[k] = nums2[n];
                k--;
                n--;
            } else {
                nums1[k] = nums1[m];
                m--;
                k--;
            }
        }
        
        while(n>=0)
        {
            nums1[k]=nums2[n];
            n--;
            k--;
        }
            

    }
}
