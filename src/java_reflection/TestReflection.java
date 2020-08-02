package java_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TestReflection {
    public static void main(String[] args) {
        Test test = new Test();
        try{
            testReflection(test);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void testReflection(Object object) throws ClassNotFoundException {
        Class myClass = object.getClass();
        Class myClass2 = Class.forName("com.parkway.member.PanelResponseDTO");
        System.out.println("Class name: " + myClass.getName());
        System.out.println("Super Class name: " + myClass.getSuperclass().getName());
        System.out.println("Is interface: " + myClass.isInterface());
        System.out.println("Constructors: ");
        Constructor[] constructors = myClass.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Number of parameters: " + constructor.getParameterCount() + " - modifier: " + getModifierName(constructor.getModifiers()));
            System.out.println("Name of constructor: " + constructor.getName());
        }

        System.out.println("Fields:");
        Field[] fields = myClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " - type: " + field.getType() + " - modifier: " + getModifierName(field.getModifiers()));
        }
    }

    private static String getModifierName(int mod){
        if(Modifier.isPrivate(mod)){
            return "private";
        }
        if (Modifier.isProtected(mod)) {
            return "protected";
        }
        if (Modifier.isPublic(mod)) {
            return "public";
        }
        return "default";

    }
}
