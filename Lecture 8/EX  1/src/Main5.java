import java.lang.reflect.*;
public class Main5 {
    public static void main(String[] args) {
        try {
            Dog d1= new Dog();
            Class obj= d1.getClass();

            Constructor[] constructors= obj.getDeclaredConstructors();
            for(Constructor c:constructors){

                System.out.println("The Name of the Constructor is : "+c.getName());

                int modifiers= c.getModifiers();
                String modifier = Modifier.toString(modifiers);
                System.out.println("The modifier is: "+ modifier);

                System.out.println("The Parameters are: "+ c.getParameterCount());
                System.out.println("");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}