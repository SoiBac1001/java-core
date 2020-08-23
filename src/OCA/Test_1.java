package OCA;

public class Test_1 {
}

class Main{
    private int i = 1;
    public static void main(String argv[]){
        float f=3;
        byte $b=127;
        int _i = 2;
        Main s = new Main ();
        s.someMethod();
    }
    public static void someMethod(){
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd'};
        String newStr = null;
        for (char c : myCharArr){
            newStr = newStr + c;
        }
        System.out.println(newStr);
        System.out.println(myStr);
        System.out.println(newStr == myStr);
        System.out.println(newStr.equals(myStr));
//        System.out.println(i);
    }
}
