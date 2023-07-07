package java_core.functional_interface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeePredicates {
    // Tất cả Employee có tuổi > 21 và có giới tính là Male
    public static Predicate<Employee> isAdultMale(){
        return p -> p.getAge() > 18 && p.getGender().equals("M");
    }

    public static List<Employee> filterEmployees(List<Employee> employeeList, Predicate<Employee> predicate){
        return employeeList.stream().filter(predicate).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,2,2,3,4,5);
        list.stream().distinct().filter(i->i>2).forEach(System.out::println);
        System.out.println(list);

        List<String> strings = Arrays.asList("code", "learn", "...");
        String streamString = strings.stream().reduce(" I'm-", String::concat);
        String parallelString = strings.parallelStream().reduce(" I'm-", String::concat);
        System.out.println("\nStream: "+streamString +"\nParallelStream: "+parallelString + "\n");

        List<Employee> employees = Arrays.asList( //
                new Employee(1, 23, "M", "Rick", "Beethovan"),
                new Employee(2, 13, "F", "Martina", "Hengis"),
                new Employee(3, 43, "M", "Ricky", "Martin"),
                new Employee(4, 26, "M", "Jon", "Lowman"),
                new Employee(5, 19, "F", "Cristine", "Maria"),
                new Employee(6, 15, "M", "David", "Feezor"),
                new Employee(7, 68, "F", "Melissa", "Roy"),
                new Employee(8, 79, "M", "Alex", "Gussin"),
                new Employee(9, 15, "F", "Neetu", "Singh"),
                new Employee(10, 45, "M", "Naveen", "Jain")
        );
        System.out.println(filterEmployees(employees, isAdultMale()));
    }
}
