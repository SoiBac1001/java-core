package test;

public class Operators {
    public static void main(String[] args) {
        // check element có thuộc collection đó hay ko ?
        long result = 0;
        for (int i = 5; i < 10; i++) {
            result |= (1 << i);
//            result |= i;
        }
        System.out.println((result & (1 << 5)) != 0);
//        System.out.println(result & 5);
    }
}

