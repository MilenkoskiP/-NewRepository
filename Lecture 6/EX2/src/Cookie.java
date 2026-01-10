public class Cookie {
    protected double weight;
    protected String shape;

    public Cookie() {
        this.weight = 50.0;
        this.shape = "Round";
    }
    public Cookie(double weight, String shape) {
        this.weight = weight;
        this.shape = shape;
    }
    public void print(){
        System.out.println("Cookie Details:");
        System.out.println("The weight is: " + weight+ " grams.");
        System.out.println("The shape is: " + shape+".");
    }

}
