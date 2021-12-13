package algorithms.java;

import java.util.Scanner;

public class XauNhiPhan {
    private static int[] array;

    private static void gen(int i, int n){
        for(int j = 0; j <= 1; j++) {
            array[i] = j;
            if(i == n - 1) {
                display(array);
            } else {
                gen(i + 1, n);
            }
        }
    }

    private static void display(int[] array){
        for(int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập n: ");
        int n = Integer.parseInt(sc.next());
        array = new int[n];

        gen(0, n);
    }
}
