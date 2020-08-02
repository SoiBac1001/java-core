package java_core.oop.inheritance;

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends Dog{
    void weep(){System.out.println("weeping...");}
}

class TestInheritance {
    public static void main(String args[]) {
        /*Dog d = new Dog();
        d.bark();
        d.eat();*/
        BabyDog babyDog=new BabyDog();
        babyDog.weep();
        babyDog.bark();
        babyDog.eat();
    }
}
