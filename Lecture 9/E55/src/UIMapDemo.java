import java.io.*;
public class UIMapDemo {
    public static void main(String[] args) {
        String fileName = "A";
        UIMap map = new UIMap();
        map.setId(23);
        map.setLocator("cssSelector");
        map.setValue("input[id=email]");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(map);
            objectOutputStream.close();
            fileOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            UIMap uiMao = (UIMap) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println(uiMao);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
