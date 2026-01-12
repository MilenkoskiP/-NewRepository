import java.io.*;
import java.nio.charset.Charset;

public class InheritanceDemo {
    public static void main(String[] args) {
        String fileName="A";
        ChildClass childClass = new ChildClass();
        childClass.setBrand("TechBeamers");
        childClass.setProduct("Blog");
        childClass.setProductId(21);

        try {
            SerializationLib.doSerialization(childClass,fileName);
            ChildClass newChild=(ChildClass) SerializationLib.doDeserialization(fileName);
            System.out.println(newChild);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
