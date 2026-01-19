public class Student {
    private String name;
    private int age;
    private int indexNo;

    public int getAge() {
        return age;
    }

    public int getIndexNo() {
        return indexNo;
    }

    public String getName() {
        return name;
    }

    public Student withAge(int age) {
        this.age = age;
        return this;
    }

    public Student withIndexNo(int indexNo) {
        this.indexNo = indexNo;
        return this;
    }

    public Student withName(String name) {
        this.name = name;
        return this;
    }
}
