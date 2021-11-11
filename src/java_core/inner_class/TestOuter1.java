package java_core.inner_class;

class A {
    interface Message {
        void msg();
    }
}

class TestNestedInterface2 implements A.Message{
    @Override
    public void msg() {
        System.out.println("Hello nested interface");
    }
}

public class TestOuter1 {
    static int data=30;
    public static class Inner{
        void msg(){System.out.println("data is "+data);}
    }

    public static void main(String[] args) {
        TestOuter1.Inner obj = new TestOuter1.Inner();
        obj.msg();

        A.Message message = new TestNestedInterface2();
        message.msg();
    }
}
