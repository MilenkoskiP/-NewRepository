import java.lang.reflect.*;
public class Main2 {
    public static void main(String[] args) {
        try {
            Dog d1 = new Dog();

            Class obj = d1.getClass();

            Method[] methods = obj.getDeclaredMethods();

            for(Method m : methods){
                System.out.println("Method Name is: "+ m.getName());

                int modifiers = m.getModifiers();
                System.out.println("Modifier is: "+ Modifier.toString(modifiers));

                System.out.println("Return types are: "+ m.getReturnType());
                System.out.println(" ");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
// What does this mean :  System.out.println(m.getReturnType().getName());