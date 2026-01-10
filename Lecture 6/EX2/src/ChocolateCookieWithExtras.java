public class ChocolateCookieWithExtras extends ChocolateCookie {
    protected  String extra;

    public ChocolateCookieWithExtras(double weight, String shape, double percentChocolate, String extra) {
        super(weight, shape, percentChocolate);
        this.extra = extra;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("The Extra Is: " + extra);
    }
}
