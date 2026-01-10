public class Trumpet extends Instrument{
    @Override
    public void play() {
        System.out.println("Trumpet is playing: Bright and powerful notes.");
    }

    @Override
    public String whatIsPlaying() {
        return ("Bright and powerful Instrument");
    }
}
