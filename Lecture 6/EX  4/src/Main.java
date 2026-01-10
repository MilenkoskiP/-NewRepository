public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[5];
        instruments[0]= new Brass();
        instruments[1]= new Percussion();
        instruments[2]= new Wired();
        instruments[3]= new Trumpet();
        instruments[4]= new Guitar();
        System.out.println("The instruments are:");
        for(Instrument i:instruments){
            i.play();
            System.out.println("Type "+ i.whatIsPlaying());

            if(i instanceof Guitar){
                Guitar guitar = (Guitar)i;
                guitar.tweak();
            }
            System.out.println();
        }
    }
}