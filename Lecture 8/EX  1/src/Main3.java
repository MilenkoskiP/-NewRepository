import java.lang.reflect.*;
public class Main3 {
    public static void main(String[] args) {
        try {
            Dog b1 = new Dog();

            Class obj = b1.getClass();

            Field field1 = obj.getDeclaredField("type");
            field1.set(b1, "labrador");

            String typeValue = (String) field1.get(b1);
            System.out.println("The Value is: "+ typeValue);

            int mod= field1.getModifiers();

            String modifiers= Modifier.toString(mod);
            System.out.println("The Modifier is: "+ modifiers);
            System.out.println(" ");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
