import java.lang.reflect.*;
public class TheMain {
    public static void main(String[] args) {
        try {
            Dog d1=new Dog();
            Class bObject=d1.getClass();

            System.out.println("The name is: "+ bObject.getSimpleName());

            int modifiers= bObject.getModifiers();
            System.out.println("The modifiers is: "+ Modifier.toString(modifiers));

            Class superclass=bObject.getSuperclass();
            System.out.println("The superclass is: "+ superclass.getSimpleName());
            System.out.println();
            Method[] methods=bObject.getDeclaredMethods();
            for(Method m:methods){
                System.out.println("The method is: "+ m.getName());

                int modifier1= m.getModifiers();
                System.out.println("The modifiers is: "+ Modifier.toString(modifier1));

                System.out.println("The return type is: "+ m.getReturnType());
                System.out.println();
            }

            Field field1=bObject.getDeclaredField("type");
            field1.set(d1, "Labrador");
            System.out.println("The type is: "+ (String)field1.get(d1));
            int mod11 =field1.getModifiers();
            System.out.println("The modifiers is: "+Modifier.toString(mod11));
            System.out.println();
            Field field2=bObject.getDeclaredField("color");
            field2.setAccessible(true);
            field2.set(d1, "brown");
            System.out.println("The color is: "+ (String)field2.get(d1));
            int mod22 =field2.getModifiers();
            System.out.println("The modifiers is: "+Modifier.toString(mod22));
            System.out.println();

            Constructor[] constructors=bObject.getDeclaredConstructors();
            for(Constructor c:constructors){
                System.out.println("The constructor is: "+ c.getName());

                int modifier2= c.getModifiers();
                System.out.println("The modifiers is: "+ Modifier.toString(modifier2));

                System.out.println("The Parameters are: "+c.getParameterCount());
                System.out.println();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
