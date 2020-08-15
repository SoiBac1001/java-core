package test;

import java.util.Scanner;

public class HeCoSo {
    public static final char CHAR_55 = 55;

    private static String he_co_so(long n, int b) {
        if (n < 0 || b < 2 || b > 16 ) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        long m;
        long remaind = n;

        while (remaind > 0) {
            if (b > 10) {
                m = remaind % b;
                if (m >= 10) {
                    sb.append((char) (CHAR_55 + m));
                } else {
                    sb.append(m);
                }
            } else {
                sb.append(remaind % b);
            }
            remaind = remaind / b;
        }
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        long n = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhập số: ");
        n = scn.nextInt();
        System.out.println("Số " + n + " trong hệ cơ số 2 = "
                + he_co_so(n, 2));
        System.out.println("Số " + n + " trong hệ cơ số 16 = "
                + he_co_so(n, 16));

    }
}
