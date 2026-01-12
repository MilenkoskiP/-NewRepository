import java.io.*;
public class SerializationDemo {
    public static void main(String[] args){
        String outputFile= "Serializationdemo.txt";
        SerializationDef def = new SerializationDef();
        def.setProduct("testProduct");
        def.setFeature("testFeature");
        def.setFeatureCount(10);
        SerializationDef def2 = null;
        try {
            SerializationLib.doSerialize(def, outputFile);

            def2 = (SerializationDef) SerializationLib.doDeserialize(outputFile);
        }catch (ClassNotFoundException | IOException e){
            System.out.println(e);
        }
        System.out.println("def():\n --"+"\n  |\n  "+def);
        System.out.println(System.lineSeparator());
        System.out.println("defNext():\n --"+"\n  |\n  "+def2);
    }
}
