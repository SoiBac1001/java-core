package algorithms;

import java.io.IOException;
import java.util.Scanner;

public class XauNhiPhanV2 {
    private static int[] mangNhiPhan;
    private static int n;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập n: ");
        n = Integer.parseInt(sc.next());

        mangNhiPhan = new int[n];

        nhiPhan(0);

    }

    /**
     * In mảng 1 chiều ra màn hình
     *
     * @param array mảng muốn in ra
     */
    private static void xuat(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();// Xuống dòng
    }

    private static void nhiPhan(int i) {
        for (int j = 0; j <= 1; ++j) {
            mangNhiPhan[i] = j;
            if (i == n - 1) {
                xuat(mangNhiPhan);
            } else {
                nhiPhan(i + 1);
            }
        }
    }
}
