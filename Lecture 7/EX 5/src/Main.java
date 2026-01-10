public class Main{
    public static void main(String[] args) {

        EBook ebook = new EBook("The Great Gatsby", "F. Scott Fitzgerald", 2.5, 180);
        AudioBook audiobook = new AudioBook("1984", "George Orwell", 500.0, 11.5);
        Movie movie = new Movie("Inception", "Christopher Nolan", 4.7, 2.5);
        InteractiveMagazine interactiveMagazine = new InteractiveMagazine("Tech Today", "Various Authors", 50.0, 30, 1.0);

        System.out.println("EBook Operations:");
        ebook.download();
        ebook.open();
        ebook.readPage(50);
        ebook.close();
        System.out.println();

        System.out.println("AudioBook Operations:");
        audiobook.download();
        audiobook.play();
        audiobook.pause();
        audiobook.stop();
        System.out.println();

        System.out.println("Movie Operations:");
        movie.download();
        movie.play();
        movie.pause();
        movie.stop();
        System.out.println();

        System.out.println("Interactive Magazine Operations:");
        interactiveMagazine.download();
        interactiveMagazine.open();
        interactiveMagazine.readPage(10);
        interactiveMagazine.play();
        interactiveMagazine.pause();
        interactiveMagazine.stop();
        interactiveMagazine.close();
    }
}