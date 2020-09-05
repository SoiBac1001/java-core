package OCA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_1 {
}

class Main{
    private static Main main = new Main();
    static {
        main.i = 6;
    }
    /*static int[] x = new int[0];
    static {
        x[0] = 10;
    }*/
    private int i = 1;
    public static void main(String argv[]){
        testLoop();
        Main main = new Main();
        testArray();
        float f=3;
        byte $b=127;
        int _i = 2;
        Main s = new Main ();
        s.someMethod();
        test1();
    }
    public static void someMethod(){
        List<Long> longList = Arrays.asList(1L, 2L);
        System.out.println(longList.contains(null));
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd'};
        String newStr = null;
        for (char c : myCharArr){
            newStr = newStr + c;
        }
        System.out.println(newStr);
        System.out.println(myStr);
        System.out.println(newStr == myStr);
        System.out.println(newStr.equals(myStr));
//        System.out.println(i);
    }

    private static void test1(){
        int[] arr1 = {3, 1, 2};
        sum(arr1);
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        int i[] = new int[]{1,2};
        int[] i1[] = {{1, 2}, {1}, {}, {1, 2, 3}};
//        int i2[4] = {1, 2, 3, 4};
        int i3[][] = {{1, 2, 3}, {4, 5, 6}};
        int i4[][] = new int[2][3]; //{{1, 2, 3}, {4, 5, 6}};
        System.out.println(i1);
//        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb.reverse());
        List s1 = new ArrayList();
        try{
            /*while (true){
                s1.add("sdfa");
            }*/
        } catch (RuntimeException re){
            re.printStackTrace();
        }
        System.out.println(s1.size());
    }

    public static void sum(int[] arr)
    {
        // getting sum of array values
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum+=arr[i];
            if( i == arr.length - 1){
                arr[i] = 99;
            }
        }

        System.out.println("sum of array values : " + sum);
    }

    private static void testArray(){

        int i = 4;
        int c[][][] = new int[i][i = 3][i];
        System.out.println(c.length + ", " + c[0].length + ", "+ c[0][0].length);
        System.out.println(c.getClass().isArray());
        int[] a= {1,2,3,4};
        int[] b= {2,3,1,0};
        System.out.println(a[(a=b)[1]]);
        int index = 1;
        try{
            getArray()[index = 2]++;
        } catch (Exception e){

        }
        System.out.println("index = " + index);
    }

    private static void testLoop(){
        int x = 0;
        lableA: for(int i = 0; i<10; i++) {
            int j = 0;
            lableB:
            while (j < 10) {
                if (j > i) {
                    break lableB;
                }

                if (i == j) {
//                    x++;
//                    System.out.println(x);
                    continue lableA;
                }
                j += 2;
            }
            x--;
        }
        System.out.println(x); // -5

        int i = 0, j =11;
        do {
            if(i > j){
                break;
            }
            j--;
        } while (++i < 5);
        System.out.println(i + ", " + j);
    }

    private static int[] getArray(){
        return null;
    }
}
