package test;

import java.util.ArrayList;

public class Person {
    private int a;

    public Person() {
    }

    public Person(int a) {
        this.a = a;
    }

    public void method1() {
        System.out.print("Person 1 ");
    }
    public void method2() {
        System.out.print("Person 2 ");
    }

    public static void main(String[] args) {
        Person person = new Undergrad();
        person.method1();
        String s = "";
        s.compareTo("a");
        ArrayList<String> s1 = new ArrayList<>();
        s1.contains("");
        
    }
}

class Student extends Person {
    public void method1() {
        System.out.print("Student 1 ");
        super.method1();
        method2();
    }
    public void method2() {
        System.out.print("Student 2 ");
    }
}

class Undergrad extends Student {
    public void method2() {
        System.out.print("Undergrad 2 ");
    }
}
