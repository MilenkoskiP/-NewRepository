public class Percussion extends Instrument{
    @Override
    public void play() {
        System.out.println("Playing the percussion instrument with rhythm.");
    }

    @Override
    public String whatIsPlaying() {
        return "Percussion Instrument";
    }
}
