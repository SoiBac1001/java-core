package java_reflection;

import java.lang.reflect.Field;

public class TestReflection2 {
    public static void main(String[] args) {
        FieldAccessible test = new FieldAccessible();
        try {
            Field theField = test.getClass().getDeclaredField("theField");
            theField.setAccessible(true);
            // get value theField
            System.out.println(theField.get(test)); // test // no exception

            Field theField2 = test.getClass().getDeclaredField("theField");
            System.out.println(theField2.get(test)); // IllegalAccessException
            // Class java_reflection.TestReflection2 can not access a member of class java_reflection.FieldAccessible with modifiers "private"
        } catch (NoSuchFieldException | IllegalAccessException e){
            System.out.println(e.getMessage());
        }
    }
}

class FieldAccessible {
    private String theField = "test";
}

