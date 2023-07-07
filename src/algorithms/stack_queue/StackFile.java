package algorithms.stack_queue;

import java.io.File;
import java.util.Objects;
import java.util.Stack;

public class StackFile {
    public static long folderSizeByRecursion(File directory) {
        long length = 0;
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (file.isFile())
                length += file.length();
            else
                length += folderSizeByRecursion(file);
        }
        return length;
    }

    public static long folderSizeByStack(File directory) {
        long length = 0;
        Stack<File> stack = new Stack<>();
        pushFileToStack(stack, directory.listFiles());
        while (!stack.isEmpty()) {
            File file = stack.pop();
            if(file.isFile()) {
                length += file.length();
            } else {
                pushFileToStack(stack, file.listFiles());
            }
        }

        return length;
    }
    
    private static void pushFileToStack(Stack<File> stack, File[] files) {
        int a = 0; // khả năng lại push vào 1 ngăn mới của thread stack
        if(files != null && files.length > 0) {
            for (File file : files) {
                stack.push(file);
            }
        }
    }

    public static void main(String[] args) {
        File directory = new File("E:\\Projects\\mm\\src\\main\\resources\\files\\output\\result\\dev-9");
        long folderSizeByRecursion = folderSizeByRecursion(directory);
        System.out.println("Folder Size By Recursion: " + folderSizeByRecursion);

        long folderSizeByStack = folderSizeByStack(directory);
        System.out.println("Folder Size By Stack: " + folderSizeByStack);
    }
}
