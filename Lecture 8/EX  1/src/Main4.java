import java.lang.reflect.*;
public class Main4  {
    public static void main(String[] args) {
        try {

            Dog d1= new Dog();

            Class obj = d1.getClass();

            Field field1 = obj.getDeclaredField("color");
            field1.setAccessible(true);
            field1.set(d1,"red");

            String clorValue = (String) field1.get(d1);
            System.out.println("The Value is: "+clorValue);

            int mod = field1.getModifiers();
            String modifier = Modifier.toString(mod);
            System.out.println("The modifier is: "+ modifier);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}