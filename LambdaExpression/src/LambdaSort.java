import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaSort {

    public static void main(String[] args) {
        // Initial data
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(500, "Shifoo", 150000));
        list.add(new Employee(504, "Oogway", 120000));
        list.add(new Employee(503, "Tigress", 100000));
        list.add(new Employee(730, "Mantis", 45000));

        System.out.println("Initial List :");
        list.forEach(System.out::println);
        Comparator<Employee> sortByName = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        };

        Collections.sort(list, sortByName);
        System.out.println("\nStandard Sorted by Name :");
        list.forEach(System.out::println);


        Comparator<Employee> lambdaSortByName =
                (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName());
        list.sort(lambdaSortByName);
        System.out.println("\nLambda Sorted by Name :");
        list.forEach(System.out::println);




        System.out.println("\nSorted by Id :");
        list.forEach(System.out::println);
    }
}
