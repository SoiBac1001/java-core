package java_core.functional_interface.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample1 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        List<Employee> employeeList = new ArrayList<>();
        for(int i=0; i<5; i++){
//            employee = new Employee();
            employee.setId(i);
            employee.setAge(18 + i);
            employeeList.add(employee);
        }
        System.out.println(employeeList);

        // Predicate String
        Predicate<String> stringPredicate = s -> s.equals("sb");
        Predicate<String> booleanPredicate = b -> true;
        Predicate<String> predicateAnd = stringPredicate.and(s -> s.length() == 3);
        Predicate<String> predicateOr = stringPredicate.or(s -> s.length() == 3);
        Predicate<String> predicateNegate = stringPredicate.negate();
        System.out.println(stringPredicate.test("sb")); // true
        System.out.println(predicateAnd.test("sb1")); // false
        System.out.println(predicateOr.test("sb1")); // true
        System.out.println(predicateNegate.test("sb")); // false
        System.out.println(stringPredicate.test("hn")); // false

        // Predicate Integer
        System.out.println("===========================");
        Predicate<Integer> greaterThanZezo = i -> i > 0;
        Predicate<Integer> lessThanFive = i -> i < 5;
        System.out.println(greaterThanZezo.test(6));  // true
        System.out.println(greaterThanZezo.test(-6)); // false
        System.out.println(greaterThanZezo.and(lessThanFive).test(3)); // true
        System.out.println(greaterThanZezo.and(lessThanFive).negate().test(3)); // false

        System.out.println("===========================");
        BiPredicate<Integer, String> condition = (i, s) -> i > 5 && s.startsWith("S");
        System.out.println(condition.test(6, "SB")); // true
        System.out.println(condition.test(3, "SB")); // false

        try{
            int i = 0;
        } catch (NumberFormatException e){
//            System.out.println("Problem in " + i);
        }
    }
}
