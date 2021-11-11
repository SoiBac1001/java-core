package java_core.inner_class;

public interface Showable {
    void show();

    interface Message {
        void msg();
    }
}

class TestNestedInterface1 implements Showable.Message {
    @Override
    public void msg() {
        System.out.println("Hello nested interface");
    }

    public static void main(String[] args) {
        Showable.Message message = new TestNestedInterface1();
        message.msg();
    }
}
