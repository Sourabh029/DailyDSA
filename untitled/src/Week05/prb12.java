package Week05;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prb12 {
    public static void main(String[] args) {

        prb12 prb12 = new prb12();
        ArrayList<Integer> union = findUnion(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 6, 7});

        union.stream().forEach(System.out::println);
    }
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here

        Set<Integer> collect = new LinkedHashSet<>();

        for(int i =0;i< a.length;i++)
        {
            collect.add(a[i]);
        }

        for(int i =0;i< b.length;i++)
        {
            collect.add(b[i]);
        }


        ArrayList<Integer> arr = new ArrayList<>(collect);

        arr.sort(Comparator.naturalOrder());

        return arr;
    }
}
