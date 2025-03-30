package ohm.softa.a03;

public class SleepingState extends State {
    protected SleepingState(int duration) {
        super(duration);
    }

    @Override
    State succesor(Cat cat) {
        return null;
    }
}
