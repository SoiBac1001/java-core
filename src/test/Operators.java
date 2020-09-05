package test;

public class Operators {
    public static void main(String[] args) {
        contains();
//        swapByXOR();
        swapByAddAndSub();
    }

    private static void contains(){
        // check xem element có thuộc collection đó hay ko ?
        // bằng cách dùng toán tử dịch bit trái
        // long: 64 bit
        long number = 5;
        long result = 0;

        for (int i = 5; i < 10; i++) {
            result |= (1L << i);
//            result |= i;
        }
        System.out.println((result & (1L << number)) != 0);
//        System.out.println(result & 5);
    }

    private static void swapByXOR(){
        int a = 5;
        int b = 7;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void swapByAddAndSub(){
        int a = 5;
        int b = 7;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b; // 12
        b = a - b; // 5
        a = a - b; // 7
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

