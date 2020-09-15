package OCA.test1;

public class Test {
    int x = 5;
    int getX(){
        return x;
    }
    public static void main(String[] args) {
        test();
        Test t = new Test();
        t.looper();
        System.out.println(t.x);

        for(int i=0; i<10; i++) System.out.print(i + " ");
        for(int i=10; i>0; i--) System.out.print(i + " ");
        int i = 20;
        System.out.print(i + "");
        for(;;Math.random()){
            System.out.println("true");
        }
    }

    public void looper(){
        int x = 0;
        while((x = getX()) != 0){ // true
            for(int m = 10; m>=0; m--){
                x = m;
            }
            break;
        }
    }

    public static void test(){
        Object a,b,c;
        a = new String("a");
        b = new String("b");
        c=a;
        a=b;
        System.out.println(c);
        Integer i = new Integer(1);
        Long m = new Long(1);
        System.out.println(i.equals(m));
        int[] arr = {1,2,3,4,5,6};
        int counter = 0;
        for(int value : arr){
            if(counter >= 5){
                break;
            } else {
                continue;
            }
//            if(value > 4){
//                arr[counter] = value + 1;
//            }
//            counter++;
        }
        System.out.println(arr[counter]);
    }

    public static int test2(int n){
        int radix = 2;
        int output = 0;
        output += radix*n;
        radix = output/radix;
        if(output < 14){
            return output;
        } else{
            output *= radix/2;
            return output;
        } /*else {

        }*/
    }
}
