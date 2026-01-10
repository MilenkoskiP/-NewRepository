public class  Main {
    public static void main(String[] args) {
        Cookie regular = new Cookie();
        System.out.println("Regular Cookie: ");
        regular.print();
        System.out.println();
        ChocolateCookie chocolateCookie = new ChocolateCookie(60.0,"Square",50.0);
        System.out.println("Chocolate Cookie: ");
        chocolateCookie.print();
        System.out.println();
        ChocolateCookieWithExtras chExtras = new ChocolateCookieWithExtras(70.0,"Heart",60.0,"Hazelnuts");
        System.out.println("Chocolate Cookie with Extras: ");
        chExtras.print();
        System.out.println();
    }
}