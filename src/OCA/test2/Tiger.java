package OCA.test2;

public class Tiger {
    public static void main(String[] args) {
        System.out.println(args);
        test(0);
        test2();
        test3();
        test4();
//        String[] s = new String[] {1, 2};
        System.out.println(args[1] instanceof String);
        int i = Integer.parseInt(args[1]);
        System.out.println(args[i]);
//        System.out.println("Value " + args[0]);
        boolean boo = false;
        if(boo == false){
            System.out.println("Hello");
        }
    }


    private static void test(int x){
        int o, m, k;
        o = m = k = 9;
        System.out.println(o);
        loop: for(int i=1; i < 5; i++){
            for(int j=1; j< 5; j++){
                System.out.println(i);
                if(0 == 0){
                    continue loop;
                }
                System.out.println(j);
            }
        }
    }

    private static void test2(){
        /*int c = 0;
        labela: while (c < 8){
//            JILL: System.out.println(c);
            labelB: for (int i = 0; i < 4; i++){
                if(c > 3){
                    break labela;
                }
            }

        }*/
    }

    private static void test3(){
        int x = 0;
        labelA: for(int i = 0; i < 5 ; i--){
            int j = 0;
            labelB: while (j < 10){
                if(j < 10){
                    if(j > i){
//                        break labelB; // break đến labelB
                        break labelA; // break đến labelA
//                        break;
                    }
                    if(i == j){
                        x++;
                        continue labelA;
                    }
                    j++;
                }
                x--;
            }
            System.out.println(x);
        }
        System.out.println("break");
    }

    private static void test4(){
        Object a, b, c;
        a = new String("A");
        b = new String("B");
        c = a;
        a = b;
        System.out.println(c);
        System.out.println(c == a);
    }
}
