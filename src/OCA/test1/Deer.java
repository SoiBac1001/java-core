package OCA.test1;

import static javafx.scene.input.KeyCode.F;

public class Deer {
    private static int loop = 10;
    private static int loop2;
    private int loop3 = 10;

    {
        loop = 0;
    }

    private static void test(){
        loop = 5;
        loop2 = 6;
//        loop3 = 6; // compile error
//        test2(); // compile error
    }

    private void test2(){
        loop = 5;
        loop2 = 6;
        loop3 = 6;
        test();
    }
    public Deer() {
        System.out.print("Deer");
    }

    public Deer(int age) {
        System.out.print("DeerAge");
    }

    private boolean hasHorns(){
        return false;
    }

    public static void main(String[] args) {
        String local;
        if(args != null){
            local = "abc";
        } else {
            local = "cdf";
        }
        int a = 10;
        int b = 20;
        a += (a = 4);
        b = b + (b = 5);
        System.out.println(a);
        System.out.println(b);
        /*if(args == null){
            local = "cdf";
        }*/
        System.out.println(local);
        System.out.println(args);
        octalDemo();
        hexadecimalDemo();
        binaryDemo();
        Deer deer = new Reindeer(5);
        System.out.println("," + deer.hasHorns());
    }

    private static int octalDemo(){
        boolean b1 = false;
        boolean b2 = false;
        int a = 5;
        double a2 = 5.0;
        byte c1 = 10;
        byte c2 = 10;
//        byte c3 = b1 + b2;
        byte c3 = ++c1;
        System.out.println(a2 > a);
        if(b2 = b1 == b2){
            System.out.println(b2);
        } else  {
            System.out.println(b2);
        }

        int octal1 = 01_7;
        System.out.println(octal1);
//        int octal2 = 018; // do not compile\
        return 0;
    }

    private static void hexadecimalDemo(){
        float hexFload = 0xbb;
        System.out.println(hexFload);
        System.out.println(octalDemo());
    }

    private static void binaryDemo(){
        float binaryChar = 0b1100;
        long a = 012;
        double f = 10.0;
//        int i = Integer.parseInt(1);
        long binaryInt = 0B1100L;
        double number = 10_0.00D;
        long number2 = 10_0_00;
        System.out.println(binaryChar);
        System.out.println(number);
        System.out.println(number2);
        System.out.println(binaryInt);
        Boolean b = Boolean.parseBoolean(" true ");
    }
}


class Reindeer extends Deer{
    public Reindeer(int age) {
//        super(age);
        System.out.print("Reindeer");
    }

    public boolean hasHorns(){
        return true;
    }
}