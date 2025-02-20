package pattern.singleton_pattern;

//Singleton với Static Inner Class (Lazy Initialization, Thread-safe)
public class BillPughSingleton {
    // Private constructor to avoid client applications to use constructor
    private BillPughSingleton() {
        System.out.println("Init");
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }


    public static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
}
