/**
 * Lớp Iterator trong java.util cung cấp các phương thức
 *  + hasNext(): có phần tử tiếp theo hay không
 *  + next(): lấy phần tử tiếp theo
 *  + remove(): loại bò phần tử cuối cùng
 */
package java_core.collection;

import java.awt.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 *
 * @author SoiBac1001
 */
public class VD_Collections {
    enum Color { GREEN, BLUE, RED, WHITE }

    public static void main(String[] args) {
        testTreeMap();
        testEnumMap();
        String source = "soibac1001";
        String encodeBase64 = encodeBase64(source.getBytes());
        System.out.println(encodeBase64);
//        String decodeBase64 = decodeBase64(source.getBytes());
        String decode = decodeBase64(encodeBase64);
        System.out.println(decode);
        System.out.println(decodeBase64("SKeBrU1w4QhjNiZENQ56"));

        Collection name = new ArrayList();
        name.add("Nui Truc");
        name.add("Giang Van Minh");
        Iterator i = name.iterator();
        String s;
        while(i.hasNext()){ // hasNext(): có phần tử tiếp theo hay không
            s = (String) i.next(); // next(): lấy phần tử tiếp theo và gán cho chuỗi s
            System.out.println(s); // hiển thị ra chuỗi s
        }
        
        ArrayList list = new ArrayList();
        int a = 0;
        for(int k=0; k<3; k++){
            a = k;
            list.add(a);
            list.add("hihi"); // sau khi add chuỗi "hihi" thì mảng ArrayList list chứa cả dữ liệu kiểu int và String
        }
        
        for(Object k : list){
            System.out.println(k + ", ");
        }
    }

    private static void testTreeMap() {
        // Creating an empty TreeMap
        TreeMap<Integer, String> tree_map
                = new TreeMap<Integer, String>();

        // Mapping string values to int keys
        // using put() method
        tree_map.put(40, "Geeks");
        tree_map.put(15, "4");
        tree_map.put(20, "Geeks");
        tree_map.put(50, "Welcomes");
        tree_map.put(30, "You");

        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map);
    }

    private static void testEnumMap() {
        {

            // Creating an EnumMap of the Color enum
            /*EnumMap<Color, Integer> colors1
                    = new EnumMap<>(Color.class);*/

            /*Map<Color, Integer> colors1
                    = new TreeMap<>();*/

            Map<Color, Integer> colors1
                    = new HashMap<>();

            // Insert elements in Map
            // using put() method
            colors1.put(Color.RED, 1);
            colors1.put(Color.GREEN, 2);
            colors1.put(Color.WHITE, 3);

            for(Color c : Color.values()) {
                System.out.println(c.name() + " - " + c.ordinal());
            }

            // Printing mappings to the console
            System.out.println("EnumMap colors1: " + colors1);

            // Creating an EnumMap of the Color Enum
            EnumMap<Color, Integer> colors2
                    = new EnumMap<>(Color.class);

            // Adding elements using the putAll() method
            colors2.putAll(colors1);
            colors2.put(Color.BLUE, 3);

            // Printing mappings to the console
            System.out.println("EnumMap colors2: " + colors2);
        }
    }

    private void test(){
        encodeBase64("source".getBytes());
    }

    private static String encodeBase64(byte[] source){
        return Base64.getEncoder().encodeToString(source);
    }

    private static String decodeBase64(byte[] source){
        return Arrays.toString(Base64.getDecoder().decode(source));
    }

    private static String decodeBase64(String source){
//        return new String(Base64.getDecoder().decode(source), StandardCharsets.UTF_8);
        return new String(Base64.getDecoder().decode(source));
    }
}
