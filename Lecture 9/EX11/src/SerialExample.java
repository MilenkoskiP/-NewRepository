import java.io.*;

public class SerialExample {
    public  static void printData(Example object1){
        System.out.println("Name: " + object1.name);
        System.out.println("age: " + object1.age);
        System.out.println("transientInt: " + object1.transientInt);
        System.out.println("staticInt: " + object1.staticInt);
    }

    public static void main(String[] args) {
        Example object = new Example("Name", 20, 2, 1000);
        String filename = "test.txt";

        try {
            printData(object);
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            object.name = "test123";
            objectOutputStream.writeObject(object);

            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Object serialized, before deserialization: ");

            object.staticInt = 5000;

        } catch (IOException e) {
            System.out.println(e);
        }


        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            object = (Example) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();

            System.out.println("Object desiralized. after deserizalizatiom:");

            printData(object);

        } catch (IOException e) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException" +
                    " is caught");
        }

    }
}
