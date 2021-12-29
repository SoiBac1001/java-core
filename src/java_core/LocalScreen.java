package java_core;

public class LocalScreen {
    private String content;

    public LocalScreen(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void method() {

        new Runnable() {
            public void run() {
                /**
                 * It means the this instance of the outer LocalScreen class.
                 * Writing this without a qualifier will return the instance of the inner class that the call is inside of.
                 */
                // Prints "An anonymous Runnable"
                System.out.println(this.toString());

                // Prints "A LocalScreen object"
                System.out.println(LocalScreen.this.toString());

                // Won't compile! 'this' is a Runnable!
//                onMake(this);

                // Compiles! Refers to enclosing object
                onMake(LocalScreen.this);
            }

            public String toString() {
                return "An anonymous Runnable!";
            }
        }.run();
    }

    public String toString() { return "A LocalScreen object";  }

    public void onMake(LocalScreen ls) {
        System.out.println("Content - " + ls.getContent());
    }

    public static void main(String[] args) {
        new LocalScreen("Coding").method();
    }
}
