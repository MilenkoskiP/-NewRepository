import java.lang.reflect.*;
public class Main {
    public static void main(String[] args) {
        try{
            Dog d1 = new Dog();

            Class obj = d1.getClass();

            String name = obj.getName();
            System.out.println("Name of the Class: "+ name);

            int modifier = obj.getModifiers();
            String mod = Modifier.toString(modifier);
            System.out.println("Modifier of the Class: "+ mod);

            Class superclass = obj.getSuperclass();
            System.out.println("Superclass of the Class: "+ superclass.getName());

        } catch (Exception Poop) {
            Poop.printStackTrace();
        }
    }
}