package ohm.softa.a03;

public class DigestingState extends State {
    protected DigestingState(int duration) {
        super(duration);
    }

    @Override
    State succesor(Cat cat) {
        return null;
    }
}
