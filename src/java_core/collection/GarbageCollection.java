package java_core.collection;

/* Java program to demonstrate that
objects created inside a method will becomes
eligible for gc after method execution terminate */
public class GarbageCollection {
    // to store object name
    String obj_name;

    public GarbageCollection(String obj_name)
    {
        this.obj_name = obj_name;
    }

    static GarbageCollection get(){
        int a = 1;
        GarbageCollection t3 = new GarbageCollection("t3");

        return t3;
    }

    static void show()
    {
        //object t1 inside method becomes unreachable when show() removed
        GarbageCollection t1 = new GarbageCollection("t1");
        display();

    }
    static void display()
    {
        //object t2 inside method becomes unreachable when display() removed
        GarbageCollection t2 = new GarbageCollection("t2");
    }

    // Driver method
    public static void main(String args[])
    {
        // calling show()
        show();

        // If a method returns the object created inside it and we store this object reference by using a reference-type variable
        // than it is no longer eligible for garbage collection.
        GarbageCollection gc1 = get();
//        get();

        // calling garbage collector
        System.gc();
        System.runFinalization();
    }

    @Override
    /* Overriding finalize method to check which object
    is garbage collected */
    protected void finalize() throws Throwable
    {
        // will print name of object
        System.out.println(this.obj_name + " successfully garbage collected");
    }
}
