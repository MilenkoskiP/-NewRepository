public class Wheel {
    private boolean isInflated;

    // All wheels start deflated
    public Wheel() {
        this.isInflated = false;
    }

    public void inflatedWheel() {
        if (!isInflated) {
            System.out.println("Wheel is deflated"); // show current state
            isInflated = true; // inflate it
            System.out.println("Wheel is now inflated"); // show new state
        } else {
            System.out.println("Wheel is already inflated");
        }
    }

    public void deflatedWheel() {
        if (isInflated) {
            isInflated = false;
            System.out.println("Wheel is now deflated");
        } else {
            System.out.println("Wheel is already deflated");
        }
    }
}