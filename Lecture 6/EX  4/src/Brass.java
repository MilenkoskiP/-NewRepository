public class Brass extends Instrument{
    @Override
    public void play() {
        System.out.println("Playing the brass instrument with a bright sound.");
    }

    @Override
    public String whatIsPlaying() {
        return "Brass Instrument";
    }
}
