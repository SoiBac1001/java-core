package test;

public class Operators {
    public static void main(String[] args) {
        // check xem element có thuộc collection đó hay ko ?
        // bằng cách dùng toán tử dịch bit trái
        // long: 64 bit
        long result = 0;

        for (int i = 5; i < 10; i++) {
            result |= (1L << i);
//            result |= i;
        }
        System.out.println((result & (1 << 5)) != 0);
//        System.out.println(result & 5);
    }
}

