package java_oop.java_interface_va_abstract;

public class Tiger extends Animal {
//    @Override
    public void run() {
        System.out.println("Running...");
    }

    public static void main(String[] args) {
        Animal tiger = new Tiger();
        tiger.run();
    }
}
