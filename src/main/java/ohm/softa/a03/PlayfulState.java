package ohm.softa.a03;

public class PlayfulState extends State {
    protected PlayfulState(int duration) {
        super(duration);
    }

    @Override
    State succesor(Cat cat) {
        return null;
    }
}
