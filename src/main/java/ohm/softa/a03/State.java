package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
    private static final Logger logger = LogManager.getLogger();
    private int t;
    private final int duration;

    protected State(int duration) {
        this.duration = duration;
    }

    State tick (Cat cat){
        return this;
    }

    abstract State succesor(Cat cat);

    public int getTime(){
        return this.t;
    }

    public int getDuration(){
        return this.duration;
    }
}
