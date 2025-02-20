package pattern.singleton_pattern;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

    // Private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {
        System.out.println("Init");
    }

    public static EagerInitializedSingleton getInstance() {
        return INSTANCE;
    }

    public static void go() {
        System.out.println("go go");;
    }
}
