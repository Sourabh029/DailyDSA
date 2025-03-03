import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPracticeCls {

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,5,6};
        StreamPracticeCls streams = new StreamPracticeCls();
        List<Integer> filter = streams.filter(Arrays.asList(arr));
        filter.stream().forEach(System.out::println);
    }
    public List<Integer> filter(List<Integer> arr)
    {
        List<Integer> collect = arr.stream().filter(x -> x < 4).collect(Collectors.toList());
        return collect;
    }

}
