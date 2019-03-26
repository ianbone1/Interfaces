package HiFi.MP3;

import HiFi.Component;
import HiFi.IConnect;
import HiFi.IPlay;
import HiFi.Stereo.Stereo;

public class MP3 extends Component implements IConnect, IPlay {

    private Stereo stereo;

    public MP3(String make, String model) {
        super(make, model);
        this.stereo = null;
    }

    public String connect(Stereo stereo) {
        this.stereo = stereo;
        return stereo.getName();
    }

    public String play() {
        if (stereo != null) {
            return "MP3 Player now playing.";
        }
        return "Not Connected";
    }
}
