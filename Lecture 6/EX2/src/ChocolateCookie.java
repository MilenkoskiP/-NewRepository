public class ChocolateCookie extends Cookie {
    protected double percentChocolate;
    public ChocolateCookie(double v, String s) {
        super();
        this.percentChocolate = 30.0;
    }

    public ChocolateCookie(double weight, String shape ,double percentChocolate) {
        super(weight, shape);
        this.percentChocolate = percentChocolate;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("The Chocolate percentage is: " + percentChocolate+ "%");
    }

}
