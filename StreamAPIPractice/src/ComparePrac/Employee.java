package ComparePrac;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }

    public static Comparator<Employee> comparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };


}
