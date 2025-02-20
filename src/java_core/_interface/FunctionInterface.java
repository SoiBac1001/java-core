package java_core._interface;

interface People {
    void say();
}
public class FunctionInterface {
    public static void main(String[] args) {
        People people1 = new People() {
            @Override
            public void say() {
                System.out.println("xyz");
            }
        };

        People people = () -> System.out.println("abc");
        display(people);
    }

    private static void display(People people) {
        people.say();
    }
}
