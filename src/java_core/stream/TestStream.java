package java_core.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc1", "abc2", "abc3");

        Optional<String> stream = list.stream().filter(element -> {
            System.out.println("filter() was called: " + element);
            return element.contains("2");
        }).map(element -> {
            System.out.println("map() was called: " + element);
            return element.toUpperCase();
        }).findFirst();
    }
}
