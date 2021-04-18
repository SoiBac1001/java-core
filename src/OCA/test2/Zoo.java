package OCA.test2;

public class Zoo {

    public static void main(String[] args) {
        int c1 = 0100_001;
        int c2 = 010_0001;
        System.out.println(c1);
        System.out.println(c2);
        Integer a = 5;
        switch (a){
            case 1:
                System.out.println(a);
            case 2:
                System.out.println(a);
        }

        char i;
        char c = 65;
        System.out.println(c == 'A');
        char j = 0;
        System.out.println(j);
        LOOP: for (i = 76; i < 77; i++){
            switch (i++){
                default:
                case '0':
                    System.out.println("A");
                case 'A':
                    System.out.println("A");
                    break LOOP;
                case 1:
                    System.out.println("B");
                    break ;
                case 2:
                    System.out.println("C");
                    break ;
                case 3:
                    System.out.println("D");
                    break ;
                case 4:
                    System.out.println("E");
                    break ;
                case 'E':
                    System.out.println("F");
            }
        }

        System.out.println(args[0]);
        System.out.println(args[1]);
        switch (i){
//            {
                case 0:
                    boolean b = false;
                    break;
                case 1:
                    b = true;
                    break;
//            }
        }
        /*if(b){
            System.out.println(args[2]);
        }*/
        long m = new Long("123");
        m = Long.valueOf("123").longValue();
        m = Long.parseLong("123");

        System.out.println("\nTest compare number");
        Integer i1 = 1;
        Integer i2 = new Integer(1);
        int i3 = 1;
        Byte b1 = 1;
        Long g1 = 1L;
        System.out.println(i1 == i2); // false
        System.out.println(i1 == i3); // true
//        System.out.println(i1 == b1); // fail compile
        System.out.println(i1.equals(i2)); // true
        System.out.println(i1.equals(g1)); // false
        System.out.println(i1.equals(b1)); // false
        int i4 = Integer.parseInt(args[0]);
        Tiger t;
        switch (i4){ //  required: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'
            case 5:
                System.out.println("ok");
            case 6 :
                System.out.println("nok");
        }
        int b = 0b00_001;

        float hexFloat = 0xbb;
        int $oi;
    }
}
