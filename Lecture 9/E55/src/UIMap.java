import java.io.*;
public class UIMap implements Externalizable {
    private int id ;
    private String locator;
    private String value;

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(id);
        objectOutput.writeObject(locator+"$$");
        objectOutput.writeObject("##"+value);
    }
    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        id = objectInput.readInt();
        locator = (String)objectInput.readObject();
        if(!locator.endsWith("$$")){
            throw  new IOException("Data integrity failed.");
        }
        locator = locator.substring(0,locator.length()-2);
        value = (String)objectInput.readObject();
        if(!value.startsWith("##")){
            throw  new IOException("Data integrity failed.");
        }
        value=value.substring(2);
    }

    @Override
    public String toString() {
        return "UIMap [id=" + id + ", locator=" + locator + ", value=" + value + "]";
    }

    public int getId() {
        return id;
    }

    public String getLocator() {
        return locator;
    }

    public String getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLocator(String locator) {
        this.locator = locator;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
