import ComparePrac.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static ComparePrac.Employee.comparator;

public class StreamPracticeCls {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,5,6};
        StreamPracticeCls streams = new StreamPracticeCls();
        //List<Integer> filter = streams.filter(Arrays.asList(arr));
         streams.Sorted(Arrays.asList(arr));
        //filter.stream().forEach(System.out::println);
        streams.map(Arrays.asList(arr));
    }
    public List<Integer> filter(List<Integer> arr)
    {
        List<Integer> collect = arr.stream().filter(x -> x < 4).collect(Collectors.toList());
        return collect;
    }

    public void map(List<Integer> arr)
    {
        List<Integer> collect = arr.stream().map(integers -> integers*integers).toList();
        collect.stream().forEach(System.out::println);
    }

    public void flatMap(List<List<Integer>> arr)
    {
        List<Integer> collect = arr.stream().flatMap(integers -> integers.stream()).toList();
        collect.stream().forEach(System.out::println);
    }

    public void distincg(List<Integer> arr)
    {
        List<Integer> collect = arr.stream().distinct().collect(Collectors.toList());
    }

    public void Sorted(List<Employee> arr)
    {
        List<Employee> collect = arr.stream().sorted(Comparator.comparing(Employee::getName)).toList();
        collect.stream().forEach(System.out::println);
    }

    public void peek(List<Employee> arr)
    {
        List<Employee> collect = arr.stream().peek(Employee::getName).sorted(Comparator.comparing(Employee::getName)).toList();
        collect.stream().forEach(System.out::println);
    }

    public void limit(List<Employee> arr)
    {
        List<Employee> collect = arr.stream().limit(5).toList();
        collect.stream().forEach(System.out::println);
    }

    public void toSet(List<Employee> arr)
    {
        Set<Employee> collect = arr.stream().peek(Employee::getName).sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toSet());
        collect.stream().forEach(System.out::println);
    }

    public void reduce(List<Employee> arr)
    {
        List<Integer> collect = arr.stream().limit(5).reduce((x,b)->x.getId()*2);
        collect.stream().forEach(System.out::println);
    }

    public void allmatch(List<Integer> arr)
    {
        boolean collect = arr.stream().distinct().allMatch(n->n%2==0);
    }

    public void FindAny(List<Integer> arr)
    {
        boolean collect = arr.stream().distinct().findAny(x->x==2);
    }

    public void Collect(List<Employee> arr)
    {
        List<Integer> collect = (List<Integer>) arr.stream().limit(5).collect(Collectors.groupingBy(Employee::getName));
        collect.stream().forEach(System.out::println);
    }










}
