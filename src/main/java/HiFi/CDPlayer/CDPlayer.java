package HiFi.CDPlayer;

import HiFi.Component;
import HiFi.IPlay;

public class CDPlayer extends Component implements IPlay {

    private int numCDs;

    public CDPlayer(String make, String model, int numCDs) {
        super(make, model);
        this.numCDs = numCDs;
    }

    public int getNumCDs() {
        return this.numCDs;
    }

    public void setNumCDs(int numCDs) {
        this.numCDs = numCDs;
    }

    public String play() {
        return "Now Playing";
    }
}
