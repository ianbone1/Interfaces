package HiFi.RecordPlayer;

import HiFi.Component;
import HiFi.IPlay;

public class RecordPlayer extends Component implements IPlay {

    private int speed;

    public RecordPlayer(String make, String model) {
        super(make, model);
        this.speed = 33;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String play() {
        return "Now Playing at "+this.speed;
    }
}
