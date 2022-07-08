package java_core.interface_java_core;

public class ThirdImpl extends AbstractThird implements ThirdInterface {

    /*public boolean isNull(String string) {
        System.out.println("Impl Null Check");

        return string == null ? true : false;
    }*/

    public static void main(String args[]){
        ThirdImpl obj = new ThirdImpl();
//        obj.print("");
        obj.print("abc");
    }

    /*@Override
    public void print(String string) {
        ThirdInterface.super.print(string);
    }*/
}
