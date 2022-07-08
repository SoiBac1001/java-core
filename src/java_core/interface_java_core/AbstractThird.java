package java_core.interface_java_core;

public class AbstractThird {
    public void print(String string) { // tại sao để default ở base class thì child class cần override it ?
        if (!isNull(string))
            System.out.println("ThirdInterface Print::" + string);
    }

    public boolean isNull(String string) {
        System.out.println("AbstractThird Check");

        return string == null ? true : false;
    }
}
