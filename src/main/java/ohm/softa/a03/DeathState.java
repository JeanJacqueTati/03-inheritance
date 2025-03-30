package ohm.softa.a03;

public class DeathState extends State {
    protected DeathState(int duration) {
        super(duration);
    }

    @Override
    State succesor(Cat cat) {
        return null;
    }
}
