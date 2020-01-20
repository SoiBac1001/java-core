package java_collection;

import java.util.*;

public class Test_Collections {
    public static void main(String[] args) {
        Integer[] arr = {1,1,3,3};
        final List<Integer> integerList = new ArrayList<>(Arrays.asList(arr));
        System.out.println("integerList" + integerList);
        Set<Integer> integerSet = new HashSet<>(integerList);
        System.out.println("integerSet" + integerSet);
//        integerList = new ArrayList<>(integerSet);
        integerList.add(5);
        integerList.set(0, 6);
        System.out.println("integerList" + integerList);
        final Integer a = 0;
//        a = 6;
//        System.out.println(a);
        final Map<Integer, Long> mapTest = new HashMap<>();
        mapTest.put(1, 5l);
        System.out.println(mapTest);
        Integer b = 5;
        grow(b);
        System.out.println(b);
    }

    static void grow(Integer a){
        Integer c = 0;
        a = c;
    }
}
