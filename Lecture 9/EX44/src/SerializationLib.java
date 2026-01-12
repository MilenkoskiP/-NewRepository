import java.io.*;
public class SerializationLib {
    public static void doSerialization(ChildClass o, String outputFile) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(o);
        objectOutputStream.close();
        fileOutputStream.close();
    }
    public static ChildClass doDeserialization(String inputFile) throws IOException,  ClassNotFoundException{
        FileInputStream fileInputStream = new FileInputStream(inputFile);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ChildClass o=(ChildClass) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return o;
    }
}
