package Week07;

import java.util.*;

public class Prb02 {
    public static void main(String[] args) {
        Prb02 prb02 = new Prb02();
        prb02.commonElements(new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 2)), new ArrayList<>(Arrays.asList(1, 1, 2, 2, 2)), new ArrayList<>(Arrays.asList(1, 1, 1, 1, 2, 2, 2, 2)));

    }
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        int i=0;
        int j =0;
        int k =0;
        Set<Integer> res = new HashSet<>();
        while(i <arr1.size() && j <arr2.size() && k<arr3.size())
        {
            if(arr1.get(i) == arr2.get(j) && arr2.get(j) == arr3.get(k))
            {
                res.add(arr1.get(i));
                i++;
                j++;
                k++;

            } else if (arr1.get(i) > arr2.get(j) && arr1.get(i) > arr3.get(k)) {
                j++;
                k++;
                
            } else if (arr3.get(k) > arr2.get(j) && arr1.get(i) < arr3.get(k)) {
                i++;
                j++;
            } else if (arr1.get(i) < arr2.get(j) && arr2.get(j) > arr3.get(k)) {
                i++;
                k++;
            } else if (arr1.get(i) == arr2.get(j) && arr1.get(i) > arr3.get(k)) {
                k++;
            } else if (arr1.get(i) == arr2.get(j) && arr2.get(j) < arr3.get(k)) {
                i++;
                j++;
            } else if (arr3.get(k) == arr2.get(j) && arr1.get(i) < arr3.get(k)) {
                i++;
            }else if (arr1.get(i) == arr3.get(k) && arr2.get(j) > arr3.get(k)) {
                i++;
                k++;
            }else if (arr3.get(k) == arr2.get(j) && arr1.get(i) > arr3.get(k)) {
                j++;
                k++;
            }else
            {
                res.add(-1);
            }

        }
        System.out.println(res);
      return new ArrayList<>(res);
        
    }
}
