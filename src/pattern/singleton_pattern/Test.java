package pattern.singleton_pattern;

public class Test {
    public static void main(String[] args) {
        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        System.out.println("[billPughSingleton]: " + billPughSingleton);

//        EagerInitializedSingleton eagerInitializedSingleton = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton.go();
//        System.out.println("[eagerInitializedSingleton]: " + eagerInitializedSingleton);
    }
}
