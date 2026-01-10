public class Bird implements Animal {

    @Override
    public void sound() {
      System.out.println("Bird makes a sound");
    }

    @Override
    public void move() {
    System.out.println("Bird moves");
    }

    @Override
    public void sleep() {
    System.out.println("Bird sleeps");
    }
}
