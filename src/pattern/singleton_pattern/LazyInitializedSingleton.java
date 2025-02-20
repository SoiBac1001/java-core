package pattern.singleton_pattern;

public class LazyInitializedSingleton {
    // Biến volatile trong Java có tác dụng thông báo sự thay đổi giá trị của biến tới các thread khác nhau nếu biến này đang được sử dụng trong nhiều thread
    private static volatile LazyInitializedSingleton INSTANCE;

    private LazyInitializedSingleton() {
    }

    public static synchronized LazyInitializedSingleton getInstance() {
        return INSTANCE != null ? INSTANCE : new LazyInitializedSingleton();
    }
}
