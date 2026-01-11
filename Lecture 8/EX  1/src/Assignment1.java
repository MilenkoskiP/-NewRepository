import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Assignment1 {
    public static void main(String[] args) {
        try {
            Test objTest = new Test();
            Class objClass = objTest.getClass();

            System.out.println("The name of the Class is: "+ objClass.getSimpleName());

            System.out.println("Constructor name is: "+ objClass.getDeclaredConstructor());

            Method[] methods = objClass.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println("The method is: "+m.getName());

                int modifier = m.getModifiers();
                String methodName = Modifier.toString(modifier);
                System.out.println("The modifier is: "+methodName);
            }
            Method method111 = objClass.getDeclaredMethod("method1");
            method111.invoke(objTest);
            Method method112 = objClass.getDeclaredMethod("method2", int.class);
            method112.invoke(objTest, 15);
            Method method113 = objClass.getDeclaredMethod("method3");
            method113.setAccessible(true);
            method113.invoke(objTest);
            Field field=objClass.getDeclaredField("s");
            field.setAccessible(true);
            field.set(objTest,"Java");
            System.out.println("New Value is: "+field.get(objTest));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


// what does this do: System.out.println((String)field.get(objTest));
