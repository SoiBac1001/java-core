package pattern.singleton_pattern;

public class DoubleCheckLockingSingleton {
    // Biến volatile trong Java có tác dụng thông báo sự thay đổi giá trị của biến tới các thread khác nhau nếu biến này đang được sử dụng trong nhiều thread
    private static volatile DoubleCheckLockingSingleton INSTANCE;

    private DoubleCheckLockingSingleton() {
    }

    public static DoubleCheckLockingSingleton getInstance() {
        // Do something before get instance ...
        if(INSTANCE == null) {
            // Do the task too long before create instance ...
            // Block so other threads cannot come into while initialize
            synchronized (DoubleCheckLockingSingleton.class) {
                // Re-check again. Maybe another thread has initialized before
                if(INSTANCE == null) {
                    INSTANCE = new DoubleCheckLockingSingleton();
                }
            }
        }

        // Do something after get instance ...
        return INSTANCE;
    }
}
