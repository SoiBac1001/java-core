package algorithms.leetcode;

public class Parentheses {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        if(s.length() == 0) {
            return true;
        }

        if((s.length() % 2) != 0) {
            return false;
        }

        return false;
    }
}
