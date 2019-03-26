package HiFi.Radio;

import HiFi.Component;

public class Radio extends Component {

    private String station;

    public Radio(String make, String model) {
        super(make, model);
        this.station = "";
    }

    public String tune(String station){
        return station + " now tuned and playing.";
    }

    public String getStation() {
        return this.station;
    }
}
