import java.io.*;
public class SerializationLib {
    public static void doSerialize(Object obj, String outputFile) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.close();
        fileOutputStream.close();
    }
    public static Object doDeserialize(String inputFile) throws IOException, ClassNotFoundException{
        FileInputStream fileInputStream = new FileInputStream(inputFile);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object o=objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return o;
    }
}
