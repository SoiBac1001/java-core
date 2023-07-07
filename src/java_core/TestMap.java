package java_core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TestMap {
    public static void main(String[] args) {
        List<String> students1 = new ArrayList<>();
        students1.add("Khanh");

        List<String> students2 = new ArrayList<>();
        students2.add("Thanh");
        students2.add("Dung");

        List<List<String>> students = Arrays.asList(students1, students2);
        students.stream().flatMap(Collection::stream)
                .filter("Khanh"::equals)
                .forEach(o -> System.out.println("Student name: " + o));
    }
}
